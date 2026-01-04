/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.m
 *  Converter.Cifp.n
 *  Converter.Cifp.o
 *  org.openide.util.NbBundle
 */
package Converter.Cifp;

import Converter.Cifp.m;
import Converter.Cifp.n;
import Converter.Cifp.o;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import org.openide.util.NbBundle;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class l
extends JDialog {
    private int a = 1;
    private JList b;
    private JLabel c;
    private JScrollPane d;
    private JButton e;
    private JButton f;
    private JButton g;

    public l(Frame window, boolean bl) {
        super((Frame)null, true);
        window = this;
        this.d = new JScrollPane();
        ((l)window).b = new JList();
        ((l)window).c = new JLabel();
        ((l)window).g = new JButton();
        ((l)window).e = new JButton();
        ((l)window).f = new JButton();
        ((JDialog)window).setDefaultCloseOperation(2);
        ((Dialog)window).setTitle(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.title_1"));
        window.setName("\u9009\u62e9");
        ((Dialog)window).setResizable(true);
        ((l)window).d.setViewportView(((l)window).b);
        ((l)window).b.getAccessibleContext().setAccessibleName(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jList1.AccessibleContext.accessibleName"));
        ((l)window).c.setText(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jLabel1.text"));
        ((l)window).g.setText(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.yesToAllButton.text"));
        ((l)window).g.addMouseListener((MouseListener)new m((l)window));
        ((l)window).e.setText(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.noToAllButton.text"));
        ((l)window).e.addMouseListener((MouseListener)new n((l)window));
        ((l)window).f.setText(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.singlePromptButton.text"));
        ((l)window).f.addMouseListener((MouseListener)new o((l)window));
        Object object = new GroupLayout(((JDialog)window).getContentPane());
        ((JDialog)window).getContentPane().setLayout((LayoutManager)object);
        ((GroupLayout)object).setHorizontalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addContainerGap().addComponent(((l)window).g).addGap(30, 30, 30).addComponent(((l)window).e).addGap(29, 29, 29).addComponent(((l)window).f)).addGroup(((GroupLayout)object).createSequentialGroup().addGap(42, 42, 42).addComponent(((l)window).d, -2, 236, -2)).addGroup(((GroupLayout)object).createSequentialGroup().addContainerGap().addComponent(((l)window).c, -1, 323, Short.MAX_VALUE))).addContainerGap()));
        ((GroupLayout)object).setVerticalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addContainerGap().addComponent(((l)window).c, -1, 44, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(((l)window).d, -2, 156, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(((l)window).g).addComponent(((l)window).e).addComponent(((l)window).f)).addContainerGap()));
        ((l)window).c.getAccessibleContext().setAccessibleName(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jLabel1.AccessibleContext.accessibleName"));
        ((l)window).g.getAccessibleContext().setAccessibleName(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jButton1.AccessibleContext.accessibleName"));
        ((l)window).e.getAccessibleContext().setAccessibleName(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jButton2.AccessibleContext.accessibleName"));
        ((l)window).f.getAccessibleContext().setAccessibleName(NbBundle.getMessage(l.class, (String)"MutiOptionDialog.jButton3.AccessibleContext.accessibleName"));
        object = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((((Dimension)object).width - 351) / 2, (((Dimension)object).height - 292) / 2, 351, 292);
        this.setLocationRelativeTo(null);
    }

    public final void a(Vector<String> vector) {
        this.b.setListData(vector);
    }

    public final int a(int n2) {
        if (n2 == 10) return n2;
        if (n2 == 11) return n2;
        if (n2 == 1) {
            return n2;
        }
        if (n2 != 12 && n2 != 4 && n2 != 5) {
            this.setVisible(true);
            return this.a;
        }
        this.setVisible(false);
        return 12;
    }

    private void b(int n2) {
        this.a = n2;
        this.setVisible(false);
        this.dispose();
    }

    static /* synthetic */ void a(l l2, MouseEvent mouseEvent) {
        l2.b(10);
    }

    static /* synthetic */ void b(l l2, MouseEvent mouseEvent) {
        l2.b(11);
    }

    static /* synthetic */ void c(l l2, MouseEvent mouseEvent) {
        l2.b(12);
    }
}
