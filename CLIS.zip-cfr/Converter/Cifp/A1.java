/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.B
 *  Converter.Cifp.C
 *  Converter.Cifp.D
 *  org.openide.util.NbBundle
 */
package Converter.Cifp;

import Converter.Cifp.B;
import Converter.Cifp.C;
import Converter.Cifp.D;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class A
extends JDialog {
    private int a = 1;
    private JButton b;
    private JButton c;
    private JLabel d;
    private JScrollPane e;
    private JButton f;
    private JList g;

    public A(Frame window, boolean bl) {
        super((Frame)null, true);
        window = this;
        this.d = new JLabel();
        ((A)window).e = new JScrollPane();
        ((A)window).g = new JList();
        ((A)window).c = new JButton();
        ((A)window).b = new JButton();
        ((A)window).f = new JButton();
        ((JDialog)window).setDefaultCloseOperation(2);
        ((Dialog)window).setTitle(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.title"));
        ((A)window).d.setText(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.jLabel1.text"));
        ((A)window).e.setViewportView(((A)window).g);
        ((A)window).g.getAccessibleContext().setAccessibleName(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.jList1.AccessibleContext.accessibleName"));
        ((A)window).c.setText(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.allYes_Button.text"));
        ((A)window).c.setLabel(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.allYes_Button.label"));
        ((A)window).c.addActionListener((ActionListener)new B((A)window));
        ((A)window).b.setText(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.allNo_Button.text"));
        ((A)window).b.setLabel(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.null.label"));
        ((A)window).b.addActionListener((ActionListener)new C((A)window));
        ((A)window).f.setText(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.rename_Button.text"));
        ((A)window).f.setLabel(NbBundle.getMessage(A.class, (String)"TableMutiOptionDialog.rename_Button.label"));
        ((A)window).f.addActionListener((ActionListener)new D((A)window));
        GroupLayout groupLayout = new GroupLayout(((JDialog)window).getContentPane());
        ((JDialog)window).getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(((A)window).d)).addGroup(groupLayout.createSequentialGroup().addGap(28, 28, 28).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(((A)window).e).addGroup(groupLayout.createSequentialGroup().addComponent(((A)window).c).addGap(18, 18, 18).addComponent(((A)window).b).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(((A)window).f))))).addContainerGap(23, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(((A)window).d).addGap(18, 18, 18).addComponent(((A)window).e, -2, 201, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(((A)window).c).addComponent(((A)window).b).addComponent(((A)window).f)).addContainerGap()));
        window.pack();
        this.setLocationRelativeTo(null);
    }

    public final void a(Vector<String> vector) {
        this.g.setListData(vector);
    }

    public final int a(int n) {
        if (n == 10) return n;
        if (n == 11) return n;
        if (n == 12) {
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

    static /* synthetic */ void a(A a, ActionEvent actionEvent) {
        a.b(10);
    }

    static /* synthetic */ void b(A a, ActionEvent actionEvent) {
        a.b(11);
    }

    static /* synthetic */ void c(A a, ActionEvent actionEvent) {
        a.b(12);
    }
}
