package lab5;

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Enter Data for 4 Documents ---");
        
        System.out.print("Text 1 Title: "); String t1Title = sc.nextLine();
        System.out.print("Text 1 Word Count: "); int t1Words = sc.nextInt(); sc.nextLine();
        
        System.out.print("PDF 1 Title: "); String p1Title = sc.nextLine();
        System.out.print("PDF 1 Page Count: "); int p1Pages = sc.nextInt(); sc.nextLine();
        
        System.out.print("Text 2 Title: "); String t2Title = sc.nextLine();
        System.out.print("Text 2 Word Count: "); int t2Words = sc.nextInt(); sc.nextLine();
        
        System.out.print("PDF 2 Title: "); String p2Title = sc.nextLine();
        System.out.print("PDF 2 Page Count: "); int p2Pages = sc.nextInt(); sc.nextLine();

        TextDocument text1 = new TextDocument(t1Title, t1Words);
        PDFDocument pdf1 = new PDFDocument(p1Title, p1Pages);
        TextDocument text2 = new TextDocument(t2Title, t2Words);
        PDFDocument pdf2 = new PDFDocument(p2Title, p2Pages);

        Document[] docs = {text1, pdf1, text2, pdf2};

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {

              PDFDocument tempPdf = (PDFDocument) d;
                totalPages += tempPdf.getPageCount();
            }
        }

        System.out.println("\n--- Document Details ---");
        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("-------------------------");
        System.out.println("Total Pages: " + totalPages);

        sc.close();
    }
}
