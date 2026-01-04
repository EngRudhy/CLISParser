/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.q
 *  Converter.Cifp.r
 *  Converter.Cifp.s
 *  Converter.Cifp.t
 *  Converter.Cifp.u
 *  org.openide.util.NbBundle
 */
package Converter.Cifp;

import Converter.Cifp.q;
import Converter.Cifp.r;
import Converter.Cifp.s;
import Converter.Cifp.t;
import Converter.Cifp.u;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ResourceBundle;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import org.openide.util.NbBundle;

public class p
extends JDialog {
    private int a = 1;
    private JLabel b;
    private JPanel c;
    private JScrollPane d;
    private JTextArea e;
    private JButton f;
    private JButton g;
    private JButton h;
    private JButton i;

    public p(Frame window, boolean bl) {
        super((Frame)null, true);
        window = this;
        this.c = new JPanel();
        ((p)window).i = new JButton();
        ((p)window).d = new JScrollPane();
        ((p)window).e = new JTextArea();
        ((p)window).b = new JLabel();
        ((p)window).g = new JButton();
        ((p)window).f = new JButton();
        ((p)window).h = new JButton();
        ((JDialog)window).setDefaultCloseOperation(2);
        ((Dialog)window).setTitle(NbBundle.getMessage(p.class, (String)"OptionDialog.title_1"));
        window.addWindowListener((WindowListener)new q((p)window));
        Object object = ResourceBundle.getBundle("Converter/Cifp/Bundle");
        ((p)window).i.setText(((ResourceBundle)object).getString("OptionDialog.yesToAllButton.text"));
        ((p)window).i.setVisible(false);
        ((p)window).i.addMouseListener((MouseListener)new r((p)window));
        GroupLayout groupLayout = new GroupLayout(((p)window).c);
        ((p)window).c.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(((p)window).i));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(((p)window).i).addContainerGap(-1, Short.MAX_VALUE)));
        ((p)window).d.setBorder(null);
        ((p)window).d.setVerticalScrollBarPolicy(21);
        ((p)window).e.setColumns(20);
        ((p)window).e.setEditable(false);
        ((p)window).e.setFont(new Font("\u5b8b\u4f53", 0, 12));
        ((p)window).e.setLineWrap(true);
        ((p)window).e.setRows(5);
        ((p)window).e.setText(NbBundle.getMessage(p.class, (String)"OptionDialog.messageTextArea.text"));
        ((p)window).e.setWrapStyleWord(true);
        ((p)window).e.setOpaque(false);
        ((p)window).d.setViewportView(((p)window).e);
        ((p)window).b.setIcon(new ImageIcon(window.getClass().getResource("/Converter/Cifp/question.png")));
        ((p)window).b.setText(((ResourceBundle)object).getString("OptionDialog.jLabel1.text"));
        ((p)window).g.setText(((ResourceBundle)object).getString("OptionDialog.noToAllButton.text"));
        ((p)window).g.setVisible(false);
        ((p)window).g.addMouseListener((MouseListener)new s((p)window));
        ((p)window).f.setText(((ResourceBundle)object).getString("OptionDialog.noButton.text"));
        ((p)window).f.addMouseListener((MouseListener)new t((p)window));
        ((p)window).h.setText(((ResourceBundle)object).getString("OptionDialog.yesButton.text"));
        ((p)window).h.addMouseListener((MouseListener)new u((p)window));
        object = new GroupLayout(((JDialog)window).getContentPane());
        ((JDialog)window).getContentPane().setLayout((LayoutManager)object);
        ((GroupLayout)object).setHorizontalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addContainerGap().addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE).addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addComponent(((p)window).c, -2, -1, -2).addGap(20, 20, 20).addComponent(((p)window).g)).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addComponent(((p)window).h, -2, 90, -2).addGap(18, 18, 18).addComponent(((p)window).f, -2, 96, -2).addGap(20, 20, 20))).addGap(69, 69, 69)).addGroup(((GroupLayout)object).createSequentialGroup().addComponent(((p)window).b, -2, 60, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(((p)window).d, -1, 331, Short.MAX_VALUE))).addContainerGap()));
        ((GroupLayout)object).setVerticalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addContainerGap().addComponent(((p)window).b, -2, 52, -2)).addGroup(((GroupLayout)object).createSequentialGroup().addGap(24, 24, 24).addComponent(((p)window).d, -2, 38, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(((p)window).c, 0, 27, Short.MAX_VALUE).addComponent(((p)window).g)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE).addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(((p)window).f).addComponent(((p)window).h)).addContainerGap(-1, Short.MAX_VALUE)));
        ((p)window).b.getAccessibleContext().setAccessibleName(NbBundle.getMessage(p.class, (String)"MultiOptionDialog.jLabel1.AccessibleContext.accessibleName"));
        object = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((((Dimension)object).width - 423) / 2, (((Dimension)object).height - 169) / 2, 423, 169);
        this.setLocationRelativeTo(null);
    }

    public final void a(String string) {
        this.e.setText(string);
    }

    public final int a(int n) {
        if (n == 2) return n;
        if (n == 3) {
            return n;
        }
        this.setVisible(true);
        return this.a;
    }

    private void b(int n) {
        this.a = n;
        this.setVisible(false);
        this.dispose();
    }

    static /* synthetic */ void a(p p2, WindowEvent windowEvent) {
        p2.b(1);
    }

    static /* synthetic */ void a(p p2, MouseEvent mouseEvent) {
        p2.b(2);
    }

    static /* synthetic */ void b(p p2, MouseEvent mouseEvent) {
        p2.b(3);
    }

    static /* synthetic */ void c(p p2, MouseEvent mouseEvent) {
        p2.b(5);
    }

    static /* synthetic */ void d(p p2, MouseEvent mouseEvent) {
        p2.b(4);
    }
}
