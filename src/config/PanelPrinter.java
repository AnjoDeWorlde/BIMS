package config;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JPanel;

public class PanelPrinter implements Printable {

    private final JPanel panelToPrint;

    public PanelPrinter(JPanel panelToPrint) {
        this.panelToPrint = panelToPrint;
    }

   @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        pageFormat.setPaper(new Paper());
        Paper paper = pageFormat.getPaper();
        double width = 8.5 * 72; 
        double height = 11 * 72; 
        paper.setSize(width, height);
        paper.setImageableArea(0, 0, width, height);
        pageFormat.setPaper(paper);

        double panelWidth = panelToPrint.getPreferredSize().getWidth();
        double panelHeight = panelToPrint.getPreferredSize().getHeight();
        double xOffset = (pageFormat.getImageableWidth() - panelWidth) / 2;
        double yOffset = pageFormat.getImageableY() + 72;
        g2d.translate(pageFormat.getImageableX() + xOffset, yOffset);

        panelToPrint.printAll(graphics);

        return Printable.PAGE_EXISTS;
    }

    public void printPanel() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }
}