package com.facebook.stetho.dumpapp;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/* JADX INFO: loaded from: classes3.dex */
public class GlobalOptions {
    public final Option optionHelp;
    public final Option optionListPlugins;
    public final Option optionProcess;
    public final Options options;

    public GlobalOptions() {
        Option option = new Option("h", "help", false, "Print this help");
        this.optionHelp = option;
        Option option2 = new Option("l", "list", false, "List available plugins");
        this.optionListPlugins = option2;
        Option option3 = new Option(TtmlNode.TAG_P, "process", true, "Specify target process");
        this.optionProcess = option3;
        Options options = new Options();
        this.options = options;
        options.addOption(option);
        options.addOption(option2);
        options.addOption(option3);
    }
}
