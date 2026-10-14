public class Main {
    public static void main(String[] args) {
        // ResumeGenerator sınıfından yeni bir nesne türetiliyor
        ResumeGenerator generator = new ResumeGenerator();
        
        // Sadece TEK bir fotoğraf adı kullanıyoruz
        generator.generateResume("Ozgecmis.pdf", "foto.png");
        
        System.out.println("PDF Ozgecmis basariyla olusturuldu!");
    }
}