package Algoritma;

public class Printer {
	
	public static void main(String[] args) {
		PDFDocument pdfDocument = new PDFDocument("pdfDocument");
		WordDocument wordDocument = new WordDocument("wordDocument");
		
		printPDFDocument(pdfDocument);
		printWordDocument(wordDocument);
	}
	
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());

	}

	public static void printWordDocument(WordDocument word) {
		System.out.println(word.getBody());			
	}
}
