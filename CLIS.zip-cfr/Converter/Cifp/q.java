/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.p
 */
package Converter.Cifp;

import Converter.Cifp.p;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Exception performing whole class analysis ignored.
 */
final class q
extends WindowAdapter {
    private /* synthetic */ p a;

    q(p p2) {
        this.a = p2;
    }

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        p.a((p)this.a, (WindowEvent)windowEvent);
    }
}
