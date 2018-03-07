//package org.ballerinalang.plugins.idea.stubs.index;
//
//import com.intellij.psi.stubs.StringStubIndexExtension;
//import com.intellij.psi.stubs.StubIndexKey;
//import org.ballerinalang.plugins.idea.BallerinaFileElementType;
//import org.ballerinalang.plugins.idea.psi.BallerinaFile;
//import org.jetbrains.annotations.NotNull;
//
//public class BallerinaPackageIndex extends StringStubIndexExtension<BallerinaFile> {
//
//    public static final StubIndexKey<String, BallerinaFile> KEY = StubIndexKey.createIndexKey("ballerina.packages");
//
//    @Override
//    public int getVersion() {
//        return BallerinaFileElementType.VERSION + 2;
//    }
//
//    @NotNull
//    @Override
//    public StubIndexKey<String, BallerinaFile> getKey() {
//        return KEY;
//    }
//}
