import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Order{
    public static void main(String args[])throws Exception{
        NewwFrame frame1 = new NewwFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//һ��Ҫ���ùر�
        frame1.setVisible(true);
    }
}

class NewwFrame extends JFrame{
    private JButton login, signin, prev, next, ordernow, myorders;
    class NewPanel extends JPanel
    {
    	public NewPanel()
    	{}
    	public void paintComponent(Graphics g) {
    		int x=0,y=0;
    		java.net.URL imgURL=getClass().getResource("UI.jpg");
    		//test.jpg�ǲ���ͼƬ����Demo.java����ͬһĿ¼��
    		ImageIcon icon=new ImageIcon(imgURL);
    		g.drawImage(icon.getImage(),x,y,getSize().width,getSize().height,this);
    		while(true) {
    			g.drawImage(icon.getImage(),x,y,this);
    			if(x>getSize().width && y>getSize().height)break;
    			//��δ�����Ϊ�˱�֤�ڴ��ڴ���ͼƬʱ��ͼƬ���ܸ�����������
    			if(x>getSize().width) {
    				x=0;
    				y+=icon.getIconHeight();
    			}
    			else
    				x+=icon.getIconWidth();
    		}
    	}
	}
    public NewwFrame(){
        super();     
        Container cont = this.getContentPane();
        NewPanel p = new NewPanel();
        cont.add(p);
        p.setLocation(0,0);
        p.setLayout(null);
        p.add(getButtonlogin(),null);
        p.add(getButtonsignin(),null);
        p.add(getButtonmyorders(),null);
        p.add(getButtonprev(),null);
        p.add(getButtonnext(),null);
        p.add(getButtonordernow(),null);
        this.setSize(815,640);
        this.setLocationRelativeTo(null);
        this.setTitle("����ô���϶���");//���ô��ڱ���
    }
    private JButton getButtonlogin(){
        if(login==null){
            login = new JButton();
            login.setBounds(70,410,70,33);
            login.setText("��½");
            login.setToolTipText("��½");
            login.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return login;
    }
    private JButton getButtonsignin(){
        if(signin==null){
            signin = new JButton();
            signin.setBounds(160,410,70,33);
            signin.setText("ע��");
            signin.setToolTipText("ע��");
            signin.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return signin;
    }
    private JButton getButtonmyorders(){
        if(myorders==null){
            myorders = new JButton();
            myorders.setBounds(100,463,100,33);
            myorders.setText("�ҵĶ���");
            myorders.setToolTipText("�ҵĶ���");
            myorders.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return myorders;
    }
    private JButton getButtonprev(){
        if(prev==null){
            prev = new JButton();
            prev.setBounds(380,470,80,33);
            prev.setText("��һҳ");
            prev.setToolTipText("��һҳ");
            prev.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return prev;
    }
    private JButton getButtonnext(){
        if(next==null){
            next = new JButton();
            next.setBounds(590,470,80,33);
            next.setText("��һҳ");
            next.setToolTipText("��һҳ");
            next.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return next;
    }
    private JButton getButtonordernow(){
        if(ordernow==null){
            ordernow = new JButton();
            ordernow.setBounds(673,552,110,33);
            ordernow.setText("�����µ���");
            ordernow.setToolTipText("�����µ���");
            ordernow.addActionListener(new nowClick());//��Ӽ������࣬����Ҫ����Ӧ���ɼ�������ķ���ʵ��
        }
        return ordernow;
    }
    private class nowClick implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Only for test...");
        }
    }
}