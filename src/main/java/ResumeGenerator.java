import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class ResumeGenerator {
    
    // Erişim düzenleyici: public (Dışarıdan erişilebilir metod)
    public void generateResume(String filePath, String imagePath) {
        // Document nesnesi oluşturuluyor (Nesne Yaşam Döngüsü başlangıcı)
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            // Kişisel Bilgiler
            document.add(new Paragraph("Hasan Cabuk - Yazilim Muhendisi Adayi"));
            document.add(new Paragraph("E-posta: ornek@email.com | Tel: 0555 555 55 55"));
            document.add(new Paragraph(" "));
            
            // Fotoğraf Ekleme (Hocanın kuralı)
            try {
                Image img = Image.getInstance(imagePath);
                img.scaleAbsolute(100, 100);
                document.add(img);
            } catch (Exception e) {
                System.out.println("Fotograf bulunamadi, atlandi.");
            }
            
            // Hayali İş Deneyimleri (Hocanın kuralı)
            document.add(new Paragraph(" "));
            document.add(new Paragraph("--- IS DENEYIMLERI ---"));
            document.add(new Paragraph("1. Google - Stajyer Yazilim Gelistirici (2024 - 2025)"));
            document.add(new Paragraph("2. Tech Corp - Backend Developer (2023 - 2024)"));
            document.add(new Paragraph("3. StartUp A.S. - Veri Analisti (2022 - 2023)"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen()) {
                document.close(); // Belge nesnesi kapatılıyor
            }
        }
    }
}