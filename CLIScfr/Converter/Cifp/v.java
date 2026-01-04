/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.w
 *  Converter.Cifp.x
 *  org.openide.util.NbBundle
 */
package Converter.Cifp;

import Converter.Cifp.w;
import Converter.Cifp.x;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ResourceBundle;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;
import org.openide.util.NbBundle;

public class v
extends JDialog
implements Runnable {
    private boolean a = false;
    private JButton b;
    private JProgressBar c;
    private JLabel d;

    public v(Frame window, boolean bl) {
        super((Frame)null, true);
        window = this;
        this.c = new JProgressBar();
        ((v)window).d = new JLabel();
        ((v)window).b = new JButton();
        ((JDialog)window).setDefaultCloseOperation(2);
        ((Dialog)window).setTitle(NbBundle.getMessage(v.class, (String)"ProcessBusyDialog.title_1"));
        window.addWindowListener((WindowListener)new w((v)window));
        Object object = ResourceBundle.getBundle("conversion/Bundle");
        ((v)window).d.setText(((ResourceBundle)object).getString("ProcessBusyDialog.messageLabel.text"));
        ((v)window).b.setText(NbBundle.getMessage(v.class, (String)"ProcessBusyDialog.jButton1.text"));
        ((v)window).b.addMouseListener((MouseListener)new x((v)window));
        object = new GroupLayout(((JDialog)window).getContentPane());
        ((JDialog)window).getContentPane().setLayout((LayoutManager)object);
        ((GroupLayout)object).setHorizontalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addContainerGap().addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(((v)window).d, GroupLayout.Alignment.LEADING, -1, 328, Short.MAX_VALUE).addComponent(((v)window).c, GroupLayout.Alignment.LEADING, -1, 328, Short.MAX_VALUE)).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)object).createSequentialGroup().addComponent(((v)window).b).addGap(41, 41, 41)))));
        ((GroupLayout)object).setVerticalGroup(((GroupLayout)object).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)object).createSequentialGroup().addContainerGap().addComponent(((v)window).d).addGap(18, 18, 18).addComponent(((v)window).c, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE).addComponent(((v)window).b)));
        window.pack();
        this.setLocationRelativeTo(null);
    }

    public final void a(String string) {
        this.d.setText(string);
    }

    public final boolean a() {
        return this.a;
    }

    public final void a(int n) {
        this.c.setValue(n);
        this.c.setStringPainted(true);
    }

    @Override
    public void run() {
    }

    static /* synthetic */ void a(v v2, WindowEvent windowEvent) {
        v0.a = true;
        v2.setVisible(false);
    }

    static /* synthetic */ void a(v v2, MouseEvent mouseEvent) {
        v0.a = true;
        v2.setVisible(false);
    }
}
