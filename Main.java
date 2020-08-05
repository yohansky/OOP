package com.company;

public class Main {
    int jumlahpermen= 10;

    public void getjumlahpermen() {
        System.out.println("jumlah permen : "+ jumlahpermen);
    }

    public void tambahpermen() {
        jumlahpermen = jumlahpermen + 1;
        System.out.println("jumlah pemen setelah ditambah: " + jumlahpermen);
    }

    public static void main(String[] args) {
	// write your code here
        Main permensusu = new Main();
        permensusu.getjumlahpermen();
        permensusu.tambahpermen();
        permensusu.getjumlahpermen();
    }
}
