package ru.mirea.lab.lab23_24.Task2.images;

import java.io.*;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParser {
    private static void downloadImage(String strImageURL){
        String strImageName =
                strImageURL.substring( strImageURL.lastIndexOf("/") + 1 );
        System.out.println("Сохранение: " + strImageName + ", from: " + strImageURL);
        try { URL urlImage = new URL(strImageURL);
            InputStream InputStream = urlImage.openStream();
            byte[] buffer = new byte[4096];
            int n = -1;
            OutputStream OutputStream = new FileOutputStream( DESTINATION_FOLDER + "/" + strImageName );
            while ( (n = InputStream.read(buffer)) != -1 ){
                OutputStream.write(buffer, 0, n);}
            OutputStream.close();
            System.out.println("Изображение сохранено");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String DESTINATION_FOLDER = "src/lab23_24/images";
    public static void main(String[] args) throws IOException {
        String strURL = "http://www.mirea.ru";
        Document document = Jsoup
                .connect(strURL)
                .userAgent("Chrome/81.0.4044.138")
                .timeout(10 * 1000) .get();
        Elements imageElements = document.select("img");
        for(Element imageElement : imageElements){
            String strImageURL = imageElement.attr("abs:src");
            downloadImage(strImageURL); }
    }
}

