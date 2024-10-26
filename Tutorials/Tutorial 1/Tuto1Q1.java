/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author szeyu
 */

class Telephone{
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject;
    
    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
} 

public class Tuto1Q1 {
    public static void main(String[] args) {
        Telephone[] telephones = new Telephone[5];
        telephones[0] = new Telephone("03","79676300");
        telephones[1] = new Telephone("03","79676301");
        telephones[2] = new Telephone("03","79676302");
        telephones[3] = new Telephone("03","79676303");
        telephones[4] = new Telephone("03","79676304");
        
        for(Telephone telephone : telephones){
            System.out.println(telephone.makeFullNumber());
        }
    }
}
