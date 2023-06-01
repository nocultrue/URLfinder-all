package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Action.Run;

/**
 * Created by IntelliJ IDEA.
 *
 * @ClassName Show
 * @author: noculture
 * @Date: 2023/5/23 11:35
 * To change this template use File | Settings | File Templates.
 **/
public class Show extends  JFrame implements ActionListener{
  JPanel jPanel_com = new JPanel();
  JPanel jPanel_all = new JPanel();
  JPanel jPanel_scanner =new JPanel();
  JButton btn = new JButton("开始扫描");
  JLabel url_label = new JLabel("输入扫描网址：");
  JTextField jTextField = new JTextField();
  JCheckBox rad = new JCheckBox("rad扫描", false);
  JCheckBox dirsearch = new JCheckBox("jsfinder扫描", false);
  JCheckBox urlFinder = new JCheckBox("URLFinder扫描", false);
  //设置代理
  JLabel proxyLable=new JLabel("设置代理模块：");
  JTextField Jtextproxy = new JTextField();

  public Show() {
    //顶层容器
    setTitle("url爬取器-酷酷信安");
    setSize(1000,700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
  public void init() {
    //中间容器

    jPanel_all.setLayout(null);
    jPanel_com.setLayout(null);
    jPanel_scanner.setLayout(null);
    //扫描组件
    btn.setBounds(20,50,100,25);
    jPanel_com.add(btn);
    //添加扫描运行监听事件
    btn.addActionListener(this);
    url_label.setBounds(140,50,100,25);
    jPanel_com.add(url_label);
    //创建输入输入框
    jTextField.setBounds(220,50,500,30);
    jPanel_com.add(jTextField);
    //选择扫描器
    rad.setBounds(240,80,100,60);
    dirsearch.setBounds(340,80,150,60);
    urlFinder.setBounds(490,80,200,60);

    jPanel_scanner.add(rad);
    jPanel_scanner.add(dirsearch);
    jPanel_scanner.add(urlFinder);
    //将面板容器作为窗口的内容面板设置到窗口

    jPanel_all.add(jPanel_scanner);
    jPanel_all.add(jPanel_com);
    add(jPanel_all);
    setVisible(true);

  }


  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if(source==btn)
    {
      //扫描器扫描
      Run run = new Run();
      //获取勾选框
      Component[] components = jPanel_scanner.getComponents();
      //选择rad扫描器
      for(Component component : components)
      {

        JCheckBox jcb = (JCheckBox) component;
        if(jcb.isSelected())
        {
          System.out.println(jcb.getText());
        }
      }
      if(source==rad)
      {
        System.out.println("this is rad");
      }
      if(source==urlFinder)
      {
        System.out.println("this is urlfinder");
      }
    }

  }
}
