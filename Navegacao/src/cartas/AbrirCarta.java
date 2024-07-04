package cartas;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;

public class AbrirCarta {
	
	
	public static void main(String[] args) {
        try {
            File file = new File("/Users/veca/Developer/Java/Navegacao/src/cartas/25121geotiff.tif");
            ImageReader reader = ImageIO.getImageReadersByFormatName("TIFF").next();
            reader.setInput(new FileImageInputStream(file));
            BufferedImage image = reader.read(0);

            if (image != null) {
                System.out.println("Arquivo TIFF aberto com sucesso.");
            } else {
                System.out.println("Não foi possível abrir o arquivo TIFF.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo TIFF: " + e.getMessage());
        }
    }
}