package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty Pix = new PixelParty();
	Pix.setColor(9, 9, 9);
	Pix.drawCircle(200, 200, 90);
	Pix.drawTriangle(200, 200, 200, 300, 300, 300);
	Pix.saveImage();
	Pix.displayImage();
}
}
