/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear.Sem2_2019.Q2;

/**
 *
 * @author szeyu
 */
public class SalesList {
    private String region;
    private String representativeName;
    private int salesAmount;

    public SalesList() {
    }

    public SalesList(String region, int salesAmount, String representativeName) {
        this.region = region;
        this.representativeName = representativeName;
        this.salesAmount = salesAmount;
    }

    public String getRegion() {
        return region;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public int getSalesAmount() {
        return salesAmount;
    }
    
    @Override
    public String toString(){
        return String.format("%-10s%4d %s", region, salesAmount, representativeName);
    }
}
