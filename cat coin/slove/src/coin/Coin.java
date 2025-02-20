/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coin;

/**
 *
 * @author dungv
 */
public class Coin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(decrypt());
    }
       private static String decrypt() {
        String flag = AES.decrypt("+ukphN/pCO2EntCBuRCiwlpsm8KaWwVDlmlxHM43vsoLaCAiPaShGZAWt6wMror1", "mayfest2021-bear-3006");
        return flag;
    }
   
    
}
