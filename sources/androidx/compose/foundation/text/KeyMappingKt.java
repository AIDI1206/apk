package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"commonKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "defaultKeyMapping", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo1563mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m7088boximpl(event)).booleanValue() && KeyEvent_androidKt.m7111isShiftPressedZmokQxo(event)) {
                    if (Key.m6797equalsimpl0(KeyEvent_androidKt.m7105getKeyZmokQxo(event), MappedKeys.INSTANCE.m1617getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m7088boximpl(event)).booleanValue()) {
                    long jM7105getKeyZmokQxo = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1595getCEK5gGoQ()) || Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1606getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1614getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1615getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1592getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1616getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1617getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m7109isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m7111isShiftPressedZmokQxo(event)) {
                    long jM7105getKeyZmokQxo2 = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1601getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1602getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1603getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1600getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1611getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1610getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1608getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1607getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1606getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM7105getKeyZmokQxo3 = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1601getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1602getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1603getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1600getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1599getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1611getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1610getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1608getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1607getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1604getEnterEK5gGoQ()) || Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1609getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1594getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1598getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1612getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1597getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1596getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1613getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m7109isCtrlPressedZmokQxo(((KeyEvent) obj).m7094unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo1563mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m7111isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m7109isCtrlPressedZmokQxo(event)) {
                    long jM7105getKeyZmokQxo = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1601getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1602getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1603getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo, MappedKeys.INSTANCE.m1600getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m7109isCtrlPressedZmokQxo(event)) {
                    long jM7105getKeyZmokQxo2 = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1601getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1602getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1603getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1600getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1605getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1598getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1594getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo2, MappedKeys.INSTANCE.m1593getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m7111isShiftPressedZmokQxo(event)) {
                    long jM7105getKeyZmokQxo3 = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1608getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo3, MappedKeys.INSTANCE.m1607getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m7108isAltPressedZmokQxo(event)) {
                    long jM7105getKeyZmokQxo4 = KeyEvent_androidKt.m7105getKeyZmokQxo(event);
                    if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo4, MappedKeys.INSTANCE.m1594getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m6797equalsimpl0(jM7105getKeyZmokQxo4, MappedKeys.INSTANCE.m1598getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo1563mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
