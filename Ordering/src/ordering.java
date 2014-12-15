import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ordering{
    public static void main(String args[])throws Exception{
        NewwFrame frame1 = new NewwFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    		ImageIcon icon=new ImageIcon(imgURL);
    		g.drawImage(icon.getImage(),x,y,getSize().width,getSize().height,this);
    		while(true) {
    			g.drawImage(icon.getImage(),x,y,this);
    			if(x>getSize().width && y>getSize().height)break;
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
        this.setTitle("胖了么网上订餐");//设置窗口标题
    }
    private JButton getButtonlogin(){
        if(login==null){
            login = new JButton();
            login.setBounds(70,410,70,33);
            login.setText("登陆");
            login.setToolTipText("登陆");
            login.addActionListener(new nowClick());
        }
        return login;
    }
    private JButton getButtonsignin(){
        if(signin==null){
            signin = new JButton();
            signin.setBounds(160,410,70,33);
            signin.setText("注册");
            signin.setToolTipText("注册");
            signin.addActionListener(new nowClick());
        }
        return signin;
    }
    private JButton getButtonmyorders(){
        if(myorders==null){
            myorders = new JButton();
            myorders.setBounds(100,463,100,33);
            myorders.setText("我的订单");
            myorders.setToolTipText("我的订单");
            myorders.addActionListener(new nowClick());
        }
        return myorders;
    }
    private JButton getButtonprev(){
        if(prev==null){
            prev = new JButton();
            prev.setBounds(380,470,80,33);
            prev.setText("上一页");
            prev.setToolTipText("上一页");
            prev.addActionListener(new nowClick());
        }
        return prev;
    }
    private JButton getButtonnext(){
        if(next==null){
            next = new JButton();
            next.setBounds(590,470,80,33);
            next.setText("下一页");
            next.setToolTipText("下一页");
            next.addActionListener(new nowClick());
        }
        return next;
    }
    private JButton getButtonordernow(){
        if(ordernow==null){
            ordernow = new JButton();
            ordernow.setBounds(673,552,110,33);
            ordernow.setText("立即下单！");
            ordernow.setToolTipText("立即下单！");
            ordernow.addActionListener(new nowClick());
        }
        return ordernow;
    }
    private class nowClick implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Only for test...");
        }
    }
}