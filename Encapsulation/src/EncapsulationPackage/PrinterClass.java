package EncapsulationPackage;

public class PrinterClass {
    private int tonerLevel;
    private int pagesPrinted;
    //duplex is true then it prints two sides of the page
    private boolean duplex;

    public PrinterClass(int tonerLevel, boolean duplex) {
        this.pagesPrinted =0;
        this.tonerLevel = (tonerLevel>=0&&tonerLevel<=100)?tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount+tonerLevel;
        if(tempAmount >100||tempAmount<0){
            return-1;
        }
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages =(duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted+=jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
