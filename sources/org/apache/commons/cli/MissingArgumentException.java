package org.apache.commons.cli;

/* JADX INFO: loaded from: classes7.dex */
public class MissingArgumentException extends ParseException {
    private Option option;

    public MissingArgumentException(String str) {
        super(str);
    }

    public MissingArgumentException(Option option) {
        this(new StringBuffer("Missing argument for option: ").append(option.getKey()).toString());
        this.option = option;
    }

    public Option getOption() {
        return this.option;
    }
}
