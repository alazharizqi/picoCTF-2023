package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo14702d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\n"}, mo14703d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, mo14704k = 2, mo14705mv = {1, 5, 1}, mo14707xi = 48)
/* compiled from: Picture.kt */
public final class PictureKt {
    public static final Picture record(Picture $this$record, int width, int height, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter($this$record, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Canvas c = $this$record.beginRecording(width, height);
        Intrinsics.checkNotNullExpressionValue(c, "beginRecording(width, height)");
        try {
            block.invoke(c);
            return $this$record;
        } finally {
            InlineMarker.finallyStart(1);
            $this$record.endRecording();
            InlineMarker.finallyEnd(1);
        }
    }
}