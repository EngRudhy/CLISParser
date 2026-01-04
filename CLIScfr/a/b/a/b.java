/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a.b.a.d
 */
package a.b.a;

import a.b.a.d;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private String a = "";
    private List<String> b = new ArrayList<String>();

    public b() {
    }

    public b(String string, String string2, d d2, String string3) {
        this.a = string2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean a(String string) {
        if (string == null) return false;
        if (string.trim().isEmpty()) {
            return false;
        }
        if (string.equalsIgnoreCase(this.a)) {
            return true;
        }
        int n = 0;
        while (n < this.b.size()) {
            if (string.equalsIgnoreCase(this.b.get(n))) {
                return true;
            }
            ++n;
        }
        return false;
    }

    public final void b(String string) throws IllegalArgumentException {
        if (string == null) throw new IllegalArgumentException("UnitInfo.addNotation():notation is null or empty");
        if (string.trim().isEmpty()) {
            throw new IllegalArgumentException("UnitInfo.addNotation():notation is null or empty");
        }
        if (this.a.isEmpty()) {
            this.a = string;
        }
        if (string.equalsIgnoreCase(this.a)) {
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.b.size()) {
                this.b.add(string);
                return;
            }
            if (string.equalsIgnoreCase(this.b.get(n))) {
                return;
            }
            ++n;
        }
    }

    public final void b() {
        this.a = null;
        if (this.b == null) return;
        this.b.clear();
        this.b = null;
    }
}
