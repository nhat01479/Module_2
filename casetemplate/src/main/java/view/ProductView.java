package view;

import model.ECategory;
import model.Product;
import service.ProductServiceInFile;
import utils.DateUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductServiceInFile productService;

    public ProductView() {
        productService = new ProductServiceInFile();
    }

    public void launcher() {
        do {
            System.out.println("Menu chương trình");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xoá sản phẩm");
            System.out.println("4. Sắp xếp sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Đọc dữ liệu từ file");
            System.out.println("7. Ghi dữ liệu xuống file");
            System.out.println("8. Tìm kiếm sản phẩm có phân trang");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showProducts(productService.findAllProduct());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    sortProduct(productService.findAllProduct());
                    break;
                case 5:
                    findProduct();
                    break;
                default:
                    System.exit(0);

            }
        } while (true);
    }

    private void findProduct() {
        List<Product> products = productService.findAllProduct();
        List<Product> findProduct = new ArrayList<>();
        System.out.println("Nhập ID");
        long id = Long.parseLong(scanner.nextLine());
        for (Product product: products){
            if (id == product.getId())
                findProduct.add(product);
        }
        showProducts(findProduct);
    }

    private void sortProduct(List<Product> products) {
        boolean checkActionMenu = true;
        do{
            System.out.println("Sắp xếp");
            System.out.println("1. Theo ID");
            System.out.println("2. Theo Tên");
            System.out.println("3. Theo Giá");
            System.out.println("4. Theo Ngày nhập");
            System.out.println("5. Theo danh mục");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> sortProductByID(products);
                case 2 -> sortProductByName(products);
                case 3 -> sortProductByPrice(products);
                case 4 -> sortProductByDate(products);
                case 5 -> sortProductByCategory(products);
                default -> {
                }
            }
            productService.writeProductToFile(products);
            showProducts(productService.findAllProduct());

            System.out.println("Bạn có muốn tiếp tục hay không?\n Nhập 'Y' để tiếp tục hoặc 'N' để trở lại");
            String choiceContinue = "-1";
            do {
                choiceContinue = scanner.nextLine().toUpperCase();
                switch (choiceContinue) {
                    case "Y":
                        break;
                    case "N":
                        checkActionMenu = false;
                        break;
                }
            } while (!choiceContinue.equals("Y") && !choiceContinue.equals("N"));
        } while (checkActionMenu);


    }

    private void sortProductByID(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getId() - o2.getId());
            }
        });
    }
    private void sortProductByName(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());

            }
        });
    }
    private void sortProductByPrice(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }
    private void sortProductByDate(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o1.getCreatAt().compareTo(o2.getCreatAt()));
            }
        });
    }
    private void sortProductByCategory(List<Product> products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o1.geteCategory().compareTo(o2.geteCategory()));
            }
        });
    }

    private void removeProduct() {
        List<Product> products = productService.findAllProduct();

        System.out.println("Nhập ID cần xoá:");
        long idRemove = Long.parseLong(scanner.nextLine());

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
//            Product product = iterator.next();
            if (idRemove ==  iterator.next().getId()) {
                iterator.remove();
            }
        }
        productService.writeProductToFile(products);



    }

    private void showProducts(List<Product> allProducts) {
        System.out.printf("%-15s %-10s %-20s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            System.out.printf("%-15s %-10s %-20s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreatAt()), p.geteCategory());
        }
    }

   private void showCreateProduct () {
            System.out.println("Thêm sản phẩm");
//            System.out.println("Nhập ID:");
//            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
            System.out.println("Nhập mô tả");
            String description = scanner.nextLine();
            System.out.println("Nhập giá");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.println("Chọn danh mục sản phẩm:");
            for (ECategory eCategory : ECategory.values()) {
                System.out.printf("Chọn %-5s %-10s\n", eCategory.getId(), eCategory.getName());
            }
            int idCategory = Integer.parseInt(scanner.nextLine());
            ECategory eCategory = ECategory.getECategoryById(idCategory);

            Product product = new Product(System.currentTimeMillis() % 100000, name, description, price, new Date(), eCategory);
            productService.addProduct(product);

            showProducts(productService.findAllProduct());
        }

}