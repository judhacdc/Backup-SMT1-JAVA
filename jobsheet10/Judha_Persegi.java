/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

class Judha_Persegi {

    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int luasan = luasPersegi(5);
        System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
    }
}
