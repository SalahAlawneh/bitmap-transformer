package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    private String  fileName;

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    private String  outputFileName;
    BufferedImage img = null;
    File inputFile=null;
    File outputFile = null;

    private int imgWidth=0;
    private int imgheight=0;


    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgheight;
    }

    public void setImgheight(int imgheight) {
        this.imgheight = imgheight;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    Bitmap(){}

    Bitmap(String fileName,String outputFileName){
        setFileName(fileName);
        setOutputFileName(outputFileName);
        inputFile =new File(getFileName());
        outputFile=new File(getOutputFileName());
    }

    public void readBitmapFile(){
        try {
            img = ImageIO.read(inputFile);
            setImgWidth(img.getWidth());
            setImgheight(img.getHeight());


        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeBitmapFile(){
        try {
            ImageIO.write(img, "PNG", outputFile);
        }catch (IOException e){
            System.out.println(e);
        }

    }


}
