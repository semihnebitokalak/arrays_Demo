public class Main {
    public static void main(String[] args) {
        String ogrenci_1 = "Ahmet";
        String ogrenci_2 = "Mehmet";
        String ogrenci_3 = "Semih";
        System.out.println(ogrenci_1);
        System.out.println(ogrenci_2);
        System.out.println(ogrenci_3);
        System.out.println("-----------");
        // Yukarıdaki gibi tek tek yazdırmak yerine dizi sayesinde hem daha kolay yazdırıp
        // Hem de daha kolay ulaşabiliriz.
        // Burada ogrenciler adında ve 4 tane veri tutan bir dizi oluşturduk.
        // İleride daha detaylı bir şekilde anlatacağız.
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Nebi";
        ogrenciler[1] = "Kerem";
        ogrenciler[2] = "Mustafa";
        ogrenciler[3] = "İbrahim";
        // Eğer ogrenciler[4] = "Samet";
        // Gibi bir atama yaparsak hata alırız çünkü oluşturduğumuz dizinin boyutu 4 tür.
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------");
        // Aşağıda yazılan kod ile yukarıda yazılan kod arasında bir fark yoktur.
        for(String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }








    }
}