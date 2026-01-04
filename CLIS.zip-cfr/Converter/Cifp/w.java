/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.v
 */
package Converter.Cifp;

import Converter.Cifp.v;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Exception performing whole class analysis ignored.
 */
final class w
extends WindowAdapter {
    private /* synthetic */ v a;

    w(v v2) {
        this.a = v2;
    }

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        v.a((v)this.a, (WindowEvent)windowEvent);
    }
}
