package view;

import model.ECategory;
import model.Product;
import service.ProductServiceInFile;
import utils.DateUtils;
import utils.FileUtils;

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
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm");
            System.out.println("6. Tìm kiếm sản phẩm");
            System.out.println("7. Đọc dữ liệu từ file");
            System.out.println("8. Ghi dữ liệu xuống file");
            System.out.println("9. Hiển thị sản phẩm có phân trang");
            System.out.println("0. Thoát");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showProducts(productService.findAllProduct());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    productService.removeProduct();
                    break;
                case 5:
                    sortProduct(productService.findAllProduct());
                    break;
                case 6:
                    System.out.println("Nhập ID muốn tìm:");
                    long idProduct = Long.parseLong(scanner.nextLine());
                    productService.findProduct(idProduct);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại");

            }
        } while (true);
    }

    private void editProduct() {
        Product product = inputIdProduct();
        if (product != null){
            boolean checkActionEdit;
            do{
                checkActionEdit = false;
                System.out.println("Bạn muốn sửa thông tin gì:");
                System.out.println("1. Sửa tên");
                System.out.println("2. Sửa mô tả");
                System.out.println("3. Sửa giá");
                System.out.println("0. Trở lại");
                int actionEdit = Integer.parseInt(scanner.nextLine());
                switch (actionEdit){
                    case 1:
                        inputNameProduct(product);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 0:
                        break;
                    default:
                        checkActionEdit = true;
                        break;
                }
            }while (checkActionEdit);
        }
    }

    private void inputNameProduct(Product product) {
        System.out.println("Thông tin sản phẩm hiện tại");
        System.out.println(product);

        System.out.println("Nhập tên mới");
        String name = scanner.nextLine();

        product.setName(name);
        productService.editProduct(product.getId(), product);

        System.out.println("Sửa thành công");
        System.out.println(product);

    }

    private Product inputIdProduct() {
        Product product = null;
        boolean checkEditProductValid = false;

        do {
            try {
                System.out.println("Nhập ID muốn tìm:");
                long idProduct = Long.parseLong(scanner.nextLine());
                product = productService.findProduct(idProduct);
                if (product == null) {
                    System.out.println("ID không hợp lệ");
                    System.out.println("1. Nhập lại\n2. Trở lại");
                    int actionEdit = Integer.parseInt(scanner.nextLine());
                    switch (actionEdit) {
                        case 1:
                            checkEditProductValid = true;
                            break;
                        case 2:
                            checkEditProductValid = false;
                            break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("ID không đúng định dạng, vui lòng nhập lại");
                checkEditProductValid = true;
            }

        } while (checkEditProductValid);
        return  product;
    }

    private void sortProduct(List<Product> products) {
        boolean checkActionMenu = true;
        do {
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
            FileUtils.writeProductToFile(productService.getPath(),products);
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
                return (o1.getECategory().compareTo(o2.getECategory()));
            }
        });
    }



    private void showProducts(List<Product> allProducts) {
        System.out.printf("%-15s %-10s %-20s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            System.out.printf("%-15s %-10s %-20s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreatAt()), p.getECategory());
        }
    }

    private void showCreateProduct() {
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