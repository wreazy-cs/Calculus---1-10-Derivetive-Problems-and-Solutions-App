import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MatematikOdev {

    // --- ANA METOT (Programın Başladığı Yer) ---
    public static void main(String[] args) {
        // Konsolda matematiksel simgelerin (karekök, üs vb.) düzgün çıkması için ayar yapıyoruz.
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (Exception e) {
            System.out.println("Dil desteği yüklenemedi, standart moda geçiliyor...");
        }

        System.out.println("==================================================");
        System.out.println("   KIRKLARELİ ÜNİVERSİTESİ - YAZILIM MÜHENDİSLİĞİ");
        System.out.println("        MATEMATİK-1 DERSİ ÖDEV PROJESİ");
        System.out.println("==================================================\n");

        // Kod karmaşasını önlemek için her sorunun çözümü ayrı metotlarda yapılandırıldı.
        
        soru1Cozumu();
        soru2Cozumu();
        soru3Cozumu();
        soru4Cozumu();
        soru5Cozumu();
        soru6Cozumu();
        soru7Cozumu();
        soru8Cozumu();
        soru9Cozumu(); 
        soru10Cozumu();
        
        System.out.println("\n>>> Ödev Tamamlandı. İyi Günler Dileriz! <<<");
    }

    // --- ÇÖZÜM FONKSİYONLARI ---

    // SORU 1: Köklü ifadelerin türevi
    public static void soru1Cozumu() {
        baslikYazdir(1, "f(x) = ∛(x²) - 1/√x türevini bulunuz.");
        
        System.out.println("[Adım 1] Köklü sayılar üslü sayı formatına çevrilir.");
        System.out.println("         Kural: n.dereceden kök(x^m) = x^(m/n)");
        System.out.println("         -> ∛(x²) ifadesi x^(2/3) olur.");
        System.out.println("         -> 1/√x ifadesi x^(-1/2) olur.");
        
        System.out.println("\n[Adım 2] Türev kuralı uygulanır: (x^n)' = n*x^(n-1)");
        System.out.println("         -> (2/3) başa iner, üs 1 azalır: (2/3)x^(-1/3)");
        System.out.println("         -> (-1/2) başa iner, üs 1 azalır: (-1/2)x^(-3/2)");
        
        sonucYazdir("f'(x) = (2/3)x^(-1/3) + (1/2)x^(-3/2)");
    }

    // SORU 2: Parametrik Türev (Sayısal)
    public static void soru2Cozumu() {
        baslikYazdir(2, "x(t)=t²+1, y(t)=t³-t için t=2 noktasındaki türev?");
        
        double t = 2.0;
        System.out.println("[Analiz] Parametrik türev formülü: dy/dx = (dy/dt) / (dx/dt)");
        System.out.println("         Verilen t değeri: " + t);
        
        // Kod ile hesaplatıyoruz
        double dxdt = 2 * t;            // x'in türevi 2t
        double dydt = 3 * (t * t) - 1;  // y'nin türevi 3t^2 - 1
        
        System.out.println("[Hesaplama]");
        System.out.println("   dx/dt = 2*2 = " + dxdt);
        System.out.println("   dy/dt = 3*(2²)-1 = " + dydt);
        
        double sonuc = dydt / dxdt;
        sonucYazdir("Sonuç (11/4) = " + sonuc);
    }

    // SORU 3: Logaritmik Türev
    public static void soru3Cozumu() {
        baslikYazdir(3, "f(x) = x^(cos x) türevi nedir?");
        
        System.out.println("[Adım 1] Taban da üs de x'e bağlı olduğu için normal türev alınamaz.");
        System.out.println("         Her iki tarafın 'ln'i alınır: ln(y) = cos(x) * ln(x)");
        
        System.out.println("\n[Adım 2] Çarpımın türevi uygulanır: (Birincinin türevi * İkinci + ...)");
        System.out.println("         (cos x)' * ln(x) + cos(x) * (ln x)'");
        System.out.println("         = -sin(x)ln(x) + cos(x)/x");
        
        System.out.println("\n[Adım 3] y yalnız bırakılmak için fonksiyonun kendisiyle çarpılır.");
        sonucYazdir("x^(cos x) * [ (cos x)/x - sin(x)ln(x) ]");
    }

    // SORU 4: Teğet Problemi
    public static void soru4Cozumu() {
        baslikYazdir(4, "y=5x+10 doğrusuna paralel teğetlerin apsisleri çarpımı?");
        
        System.out.println("[Mantık] Paralel ise eğimler eşittir. Doğrunun eğimi m=5.");
        System.out.println("         Fonksiyonun türevi (eğim) 5'e eşitlenmelidir.");
        
        // f(x) = x^3 - 2x^2 + x - 5
        // Türevi: 3x^2 - 4x + 1
        System.out.println("\n[Denklem] 3x² - 4x + 1 = 5");
        System.out.println("          3x² - 4x - 4 = 0  (5 sol tarafa atıldı)");
        
        System.out.println("\n[Çözüm] Kökler çarpımı formülü c/a kullanılır.");
        double c = -4.0;
        double a = 3.0;
        
        sonucYazdir("c/a = " + c + "/" + a + " = " + (c/a));
    }

    // SORU 5: Maksimum Değer Bulma
    public static void soru5Cozumu() {
        baslikYazdir(5, "[-2, 3] aralığında mutlak maksimum değer?");
        
        System.out.println("[Adım 1] Kritik noktalar bulunur (Türevi 0 yapanlar).");
        System.out.println("         f'(x) = 6x² - 6x - 12 = 0 -> Kökler x=2 ve x=-1");
        
        System.out.println("\n[Adım 2] Bilgisayara tüm aday noktaları hesaplatıyoruz:");
        double[] noktalar = {-2, -1, 2, 3}; 
        double maxDeger = -10000; 
        
        for(double x : noktalar) {
            double sonuc = 2*Math.pow(x,3) - 3*Math.pow(x,2) - 12*x + 5;
            System.out.println("   -> x = " + (int)x + " için sonuç = " + (int)sonuc);
            
            if(sonuc > maxDeger) {
                maxDeger = sonuc; 
            }
        }
        
        sonucYazdir("En büyük değer (Maksimum): " + (int)maxDeger);
    }

    // SORU 6: Bölümün Türevi
    public static void soru6Cozumu() {
        baslikYazdir(6, "f(x) = (x²+1)/(x-2) türevi?");
        
        System.out.println("[Kural] Bölüm türevi: (Pay' . Payda - Payda' . Pay) / Payda²");
        System.out.println("        Pay = x²+1  -> Türevi = 2x");
        System.out.println("        Payda = x-2 -> Türevi = 1");
        
        System.out.println("\n[İşlem] [2x(x-2) - 1(x²+1)] / (x-2)²");
        System.out.println("        [2x² - 4x - x² - 1] / (x-2)²");
        
        sonucYazdir("(x² - 4x - 1) / (x-2)²");
    }

    // SORU 7: Parametrik Eğim
    public static void soru7Cozumu() {
        baslikYazdir(7, "x=t², y=t³-3t eğrisinin t=2 noktasındaki eğimi?");
        
        double t = 2.0;
        System.out.println("[Hesaplama] t=2 için türevler hesaplanıyor...");
        
        double dx_dt = 2 * t;              // 2t
        double dy_dt = 3 * (t * t) - 3;    // 3t^2 - 3
        
        System.out.println("   dx/dt = " + dx_dt);
        System.out.println("   dy/dt = " + dy_dt);
        
        sonucYazdir("Eğim (dy/dx) = " + dy_dt + "/" + dx_dt + " = " + (dy_dt/dx_dt));
    }

    // SORU 8: Logaritmik Türev (Sinüs)
    public static void soru8Cozumu() {
        baslikYazdir(8, "f(x) = x^(sin x) türevi?");
        
        System.out.println("[Adım 1] Benzer şekilde 'ln' alınarak başlanır.");
        System.out.println("         ln(y) = sin(x) * ln(x)");
        
        System.out.println("\n[Adım 2] Çarpım türevi uygulanır.");
        System.out.println("         sin'(x).ln(x) + sin(x).ln'(x)");
        System.out.println("         cos(x).ln(x) + sin(x).(1/x)");
        
        sonucYazdir("x^(sin x) * [ cos(x)ln(x) + sin(x)/x ]");
    }

    // SORU 9: Polinom Algoritması
    public static void soru9Cozumu() {
        baslikYazdir(9, "y = 6x⁵ - 8x⁴ + 2x³ - 3x + 5 (4. Türev)");
        
        System.out.println("[Algoritma] Bu soru döngü kullanılarak çözüldü.");
        System.out.println("            Polinom, bir matris dizisi olarak tanımlandı.");
        
        // Polinom: {Katsayı, Üs}
        double[][] polinom = {
            {6, 5}, {-8, 4}, {2, 3}, {-3, 1}, {5, 0}
        };
        
        System.out.print("Başlangıç: ");
        polinomYazdir(polinom);
        
        // 4 Kere Türev Alan Döngü
        for(int i=1; i<=4; i++) {
            polinom = turevAl(polinom);
            System.out.print(i + ". Türev -> ");
            polinomYazdir(polinom);
        }
        
        System.out.println("\n[Sonuç Analizi] 4. türev sonunda x'li terim ve sabit sayı kalmıştır.");
        System.out.print("Sonuç: ");
        polinomYazdir(polinom);
        cizgiCek();
    }

    // SORU 10: x=0 Noktası
    public static void soru10Cozumu() {
        baslikYazdir(10, "e^x/(x+1) fonksiyonunun x=0'daki türevi?");
        
        System.out.println("[Adım 1] Bölüm türevi alındı ve sadeleştirildi.");
        System.out.println("         f'(x) = x.e^x / (x+1)² şeklinde bir sonuç bulundu.");
        
        System.out.println("\n[Adım 2] x yerine 0 koyarak sonuç hesaplanıyor.");
        double x = 0.0;
        double pay = x * Math.exp(x);
        double payda = Math.pow(x+1, 2);
        
        System.out.println("   (" + pay + ") / (" + payda + ")");
        sonucYazdir("Sonuç: " + (pay/payda));
    }

    // --- YARDIMCI METOTLAR ---

    // Sorulara şık bir başlık ekler
    public static void baslikYazdir(int no, String soru) {
        System.out.println("\n[SORU " + no + "] " + soru);
        System.out.println("--------------------------------------------------");
    }

    // Sonucu kutu içine alır gibi yazdırır
    public static void sonucYazdir(String cevap) {
        System.out.println(">>> CEVAP: " + cevap);
        cizgiCek();
    }

    // Ayırıcı çizgi
    public static void cizgiCek() {
        System.out.println("==================================================");
    }

    // Türev Alma Mantığı
    public static double[][] turevAl(double[][] p) {
        double[][] yeniP = new double[p.length][2];
        for(int i=0; i<p.length; i++) {
            double katsayi = p[i][0];
            double us = p[i][1];
            
            if(us > 0) {
                yeniP[i][0] = katsayi * us;
                yeniP[i][1] = us - 1;
            } else {
                yeniP[i][0] = 0; // Sabit sayının türevi 0'dır
                yeniP[i][1] = 0;
            }
        }
        return yeniP;
    }

    // Polinomu ekrana düzgün yazdırma
    public static void polinomYazdir(double[][] p) {
        boolean ilkEleman = true;
        for(double[] terim : p) {
            if(terim[0] != 0) { // 0 olanları yazma
                if(!ilkEleman && terim[0] > 0) System.out.print("+");
                
                if(terim[0] == (long)terim[0])
                    System.out.print((long)terim[0]);
                else
                    System.out.print(terim[0]);
                
                if(terim[1] == 1) System.out.print("x ");
                else if(terim[1] > 1) System.out.print("x^" + (int)terim[1] + " ");
                
                ilkEleman = false;
            }
        }
        System.out.println();
    }
}