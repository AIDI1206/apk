package com.medicmedia.medilink.ui.contents;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.apksig.internal.apk.AndroidBinXmlParser;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.medicmedia.medilink.domain.model.ContentsFilterListType;
import com.medicmedia.medilink.ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: ContentsFilterListDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/contents/ContentsFilterListDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "listType", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;", "<init>", "(Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;)V", "viewModel", "Lcom/medicmedia/medilink/ui/contents/ContentsFilterListViewModel;", "getViewModel", "()Lcom/medicmedia/medilink/ui/contents/ContentsFilterListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onBack", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@AndroidEntryPoint
public final class ContentsFilterListDialogFragment extends Hilt_ContentsFilterListDialogFragment {
    public static final int $stable = 8;
    private final ContentsFilterListType listType;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public ContentsFilterListDialogFragment(ContentsFilterListType listType) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        this.listType = listType;
        final ContentsFilterListDialogFragment contentsFilterListDialogFragment = this;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return contentsFilterListDialogFragment;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(contentsFilterListDialogFragment, Reflection.getOrCreateKotlinClass(ContentsFilterListViewModel.class), new Function0<ViewModelStore>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m9039viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM9039viewModels$lambda1 = FragmentViewModelLazyKt.m9039viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM9039viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9039viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM9039viewModels$lambda1 = FragmentViewModelLazyKt.m9039viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM9039viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9039viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = contentsFilterListDialogFragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentsFilterListViewModel getViewModel() {
        return (ContentsFilterListViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-265919228, true, new Function2<Composer, Integer, Unit>() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1

            /* JADX INFO: renamed from: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: ContentsFilterListDialogFragment.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ ContentsFilterListDialogFragment this$0;

                AnonymousClass1(ContentsFilterListDialogFragment contentsFilterListDialogFragment) {
                    this.this$0 = contentsFilterListDialogFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C42@1669L64,39@1520L236:ContentsFilterListDialogFragment.kt#arbiu8");
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(629131295, i, -1, "com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ContentsFilterListDialogFragment.kt:39)");
                        }
                        ContentsFilterListViewModel viewModel = this.this$0.getViewModel();
                        ContentsFilterListType contentsFilterListType = this.this$0.listType;
                        composer.startReplaceGroup(-1452501675);
                        ComposerKt.sourceInformation(composer, "CC(remember):ContentsFilterListDialogFragment.kt#9igjgp");
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ContentsFilterListDialogFragment contentsFilterListDialogFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                                  (r0v3 'contentsFilterListDialogFragment' com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment A[DONT_INLINE])
                                 A[MD:(com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment):void (m)] (LINE:43) call: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment):void type: CONSTRUCTOR in method: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes6.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 106 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "C42@1669L64,39@1520L236:ContentsFilterListDialogFragment.kt#arbiu8"
                                androidx.compose.runtime.ComposerKt.sourceInformation(r10, r0)
                                r0 = r11 & 3
                                r1 = 2
                                if (r0 != r1) goto L15
                                boolean r0 = r10.getSkipping()
                                if (r0 != 0) goto L11
                                goto L15
                            L11:
                                r10.skipToGroupEnd()
                                return
                            L15:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L24
                                r0 = -1
                                java.lang.String r1 = "com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ContentsFilterListDialogFragment.kt:39)"
                                r2 = 629131295(0x257fc81f, float:2.2185528E-16)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                            L24:
                                com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment r11 = r9.this$0
                                com.medicmedia.medilink.ui.contents.ContentsFilterListViewModel r5 = com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment.access$getViewModel(r11)
                                com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment r11 = r9.this$0
                                com.medicmedia.medilink.domain.model.ContentsFilterListType r1 = com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment.access$getListType$p(r11)
                                r11 = -1452501675(0xffffffffa96c9555, float:-5.253205E-14)
                                r10.startReplaceGroup(r11)
                                java.lang.String r11 = "CC(remember):ContentsFilterListDialogFragment.kt#9igjgp"
                                androidx.compose.runtime.ComposerKt.sourceInformation(r10, r11)
                                com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment r11 = r9.this$0
                                boolean r11 = r10.changedInstance(r11)
                                com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment r0 = r9.this$0
                                java.lang.Object r2 = r10.rememberedValue()
                                if (r11 != 0) goto L51
                                androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r11 = r11.getEmpty()
                                if (r2 != r11) goto L59
                            L51:
                                com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r2 = new com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                                r2.<init>(r0)
                                r10.updateRememberedValue(r2)
                            L59:
                                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                r10.endReplaceGroup()
                                r7 = 0
                                r8 = 25
                                r0 = 0
                                r3 = 0
                                r4 = 0
                                r6 = r10
                                com.medicmedia.medilink.ui.contents.ContentsFilterListViewKt.ContentsFilterListView(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                                boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r10 == 0) goto L71
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L71:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$onCreateView$1$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(ContentsFilterListDialogFragment contentsFilterListDialogFragment) {
                            contentsFilterListDialogFragment.onBack();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        ComposerKt.sourceInformation(composer, "C38@1498L276,38@1484L290:ContentsFilterListDialogFragment.kt#arbiu8");
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-265919228, i, -1, "com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment.onCreateView.<anonymous>.<anonymous> (ContentsFilterListDialogFragment.kt:38)");
                            }
                            ThemeKt.MedilinkTheme(false, null, ComposableLambdaKt.rememberComposableLambda(629131295, true, new AnonymousClass1(this.this$0), composer, 54), composer, AndroidBinXmlParser.Chunk.RES_XML_TYPE_RESOURCE_MAP, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }));
                return composeView;
            }

            @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
            public void onStart() {
                Window window;
                super.onStart();
                Dialog dialog = getDialog();
                BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
                if (bottomSheetDialog == null || (window = bottomSheetDialog.getWindow()) == null) {
                    return;
                }
                WindowCompat.setDecorFitsSystemWindows(window, false);
                new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightStatusBars(true);
                View viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById == null) {
                    return;
                }
                ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.medicmedia.medilink.ui.contents.ContentsFilterListDialogFragment$$ExternalSyntheticLambda0
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return ContentsFilterListDialogFragment.onStart$lambda$1(view, windowInsetsCompat);
                    }
                });
                ViewCompat.requestApplyInsets(viewFindViewById);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                viewFindViewById.setLayoutParams(layoutParams);
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setDraggable(false);
                bottomSheetBehaviorFrom.setFitToContents(false);
                bottomSheetBehaviorFrom.setExpandedOffset(0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final WindowInsetsCompat onStart$lambda$1(View view, WindowInsetsCompat windowInsetsCompat) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNull(view);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), insets.bottom);
                return WindowInsetsCompat.CONSUMED;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void onBack() {
                View viewFindViewById;
                Dialog dialog = getDialog();
                BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
                if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setState(5);
            }
        }
