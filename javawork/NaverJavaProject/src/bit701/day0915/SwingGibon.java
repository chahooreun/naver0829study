package bit701.day0915;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.accessibility.AccessibleContext;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.TransferHandler;
public class SwingGibon extends JFrame{
	


public SwingGibon() {
// TODO Auto-generated method stub
this.setLocation(300,100);//프레임의 시작위치
this.setSize(300,300);//프레임의 너비,높이
this.setVisible(true);//true:프레임을 보이게 하기,false:프레임숨기기

//윈도우 이벤트 발생
this.addWindowListener(new WindowAdapter() {
@Override
protected void windowClosing(WindowEvent e) {
	JOptionPane.showMessageDialog(SwingGibon,this,"프레임을 종료합니다")
	System.exit(0);
});
	// TODO Auto-generated method stub
	super.windowClosed(e);
}

}

	

@Override
protected JRootPane createRootPane() {
	// TODO Auto-generated method stub
	return super.createRootPane();
}

@Override
protected void processWindowEvent(WindowEvent e) {
	// TODO Auto-generated method stub
	super.processWindowEvent(e);
}

@Override
public void setDefaultCloseOperation(int operation) {
	// TODO Auto-generated method stub
	super.setDefaultCloseOperation(operation);
}

@Override
public int getDefaultCloseOperation() {
	// TODO Auto-generated method stub
	return super.getDefaultCloseOperation();
}

@Override
public void setTransferHandler(TransferHandler newHandler) {
	// TODO Auto-generated method stub
	super.setTransferHandler(newHandler);
}

@Override
public TransferHandler getTransferHandler() {
	// TODO Auto-generated method stub
	return super.getTransferHandler();
}

@Override
public void update(Graphics g) {
	// TODO Auto-generated method stub
	super.update(g);
}

@Override
public void setJMenuBar(JMenuBar menubar) {
	// TODO Auto-generated method stub
	super.setJMenuBar(menubar);
}

@Override
public JMenuBar getJMenuBar() {
	// TODO Auto-generated method stub
	return super.getJMenuBar();
}

@Override
protected boolean isRootPaneCheckingEnabled() {
	// TODO Auto-generated method stub
	return super.isRootPaneCheckingEnabled();
}

@Override
protected void setRootPaneCheckingEnabled(boolean enabled) {
	// TODO Auto-generated method stub
	super.setRootPaneCheckingEnabled(enabled);
}

@Override
protected void addImpl(Component comp, Object constraints, int index) {
	// TODO Auto-generated method stub
	super.addImpl(comp, constraints, index);
}

@Override
public void remove(Component comp) {
	// TODO Auto-generated method stub
	super.remove(comp);
}

@Override
public void setLayout(LayoutManager manager) {
	// TODO Auto-generated method stub
	super.setLayout(manager);
}

@Override
public JRootPane getRootPane() {
	// TODO Auto-generated method stub
	return super.getRootPane();
}

@Override
protected void setRootPane(JRootPane root) {
	// TODO Auto-generated method stub
	super.setRootPane(root);
}

@Override
public void setIconImage(Image image) {
	// TODO Auto-generated method stub
	super.setIconImage(image);
}

@Override
public Container getContentPane() {
	// TODO Auto-generated method stub
	return super.getContentPane();
}

@Override
public void setContentPane(Container contentPane) {
	// TODO Auto-generated method stub
	super.setContentPane(contentPane);
}

@Override
public JLayeredPane getLayeredPane() {
	// TODO Auto-generated method stub
	return super.getLayeredPane();
}

@Override
public void setLayeredPane(JLayeredPane layeredPane) {
	// TODO Auto-generated method stub
	super.setLayeredPane(layeredPane);
}

@Override
public Component getGlassPane() {
	// TODO Auto-generated method stub
	return super.getGlassPane();
}

@Override
public void setGlassPane(Component glassPane) {
	// TODO Auto-generated method stub
	super.setGlassPane(glassPane);
}

@Override
public Graphics getGraphics() {
	// TODO Auto-generated method stub
	return super.getGraphics();
}

@Override
public void repaint(long time, int x, int y, int width, int height) {
	// TODO Auto-generated method stub
	super.repaint(time, x, y, width, height);
}

@Override
protected String paramString() {
	// TODO Auto-generated method stub
	return super.paramString();
}

@Override
public AccessibleContext getAccessibleContext() {
	// TODO Auto-generated method stub
	return super.getAccessibleContext();
}

	public static void main(String[] args) {
		SwingGibon s=new SwingGibon();

	}

}
