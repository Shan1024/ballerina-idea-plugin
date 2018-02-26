//package com.simpleplugin;
//
//import com.intellij.openapi.project.Project;
//import com.intellij.openapi.vfs.VirtualFile;
//import com.intellij.psi.PsiManager;
//import com.intellij.psi.search.FileTypeIndex;
//import com.intellij.psi.search.GlobalSearchScope;
//import com.intellij.psi.util.PsiTreeUtil;
//import com.simpleplugin.psi.SimpleFile;
//import com.simpleplugin.psi.SimpleProperty;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//public class SimpleUtil {
//
//    public static List<SimpleProperty> findProperties(Project project, String key) {
//        List<SimpleProperty> result = new ArrayList<>();
//        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(SimpleFileType.INSTANCE,
//                GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (simpleFile == null) {
//                continue;
//            }
//            List<SimpleProperty> properties = PsiTreeUtil.getChildrenOfTypeAsList(simpleFile, SimpleProperty.class);
//            for (SimpleProperty property : properties) {
//                if (key.equals(property.getKey())) {
//                    result.add(property);
//                }
//            }
//        }
//        return result;
//    }
//
//    public static List<SimpleProperty> findProperties(Project project) {
//        List<SimpleProperty> result = new ArrayList<>();
//        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(SimpleFileType.INSTANCE,
//                GlobalSearchScope.allScope(project));
//        for (VirtualFile virtualFile : virtualFiles) {
//            SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(virtualFile);
//            if (simpleFile == null) {
//                continue;
//            }
//            SimpleProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, SimpleProperty.class);
//            if (properties == null) {
//                continue;
//            }
//            Collections.addAll(result, properties);
//        }
//        return result;
//    }
//}
