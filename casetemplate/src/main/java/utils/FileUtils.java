package utils;

import model.IModel;
import model.Product;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static <T> void  writeProductToFile(String path, List<T> data){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (T item: data){
                bufferedWriter.write(item.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static <T> List<T> readFile(String path, Class<T> tClass){
        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Object obj = tClass.getDeclaredConstructor().newInstance();
                IModel<T> iModel = (IModel<T>) obj;
                iModel.parseData(line);

                datas.add((T) obj);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return datas;

    }
}
