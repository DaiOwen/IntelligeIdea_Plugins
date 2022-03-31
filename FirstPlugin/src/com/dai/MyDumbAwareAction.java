package com.dai;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * @Classname MyDumbAwareAction
 * @Description TODO
 * @Date 2022/3/31 16:58
 * @Created by daihuhu
 */
public class MyDumbAwareAction extends AnAction {
    public MyDumbAwareAction(String login1) {
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        PsiFile psiFile = anActionEvent.getData(CommonDataKeys.PSI_FILE);
        String classPath = psiFile.getVirtualFile().getPath();
        String title = "虎虎!";
        Messages.showMessageDialog(project, classPath, title, Messages.getInformationIcon());
    }
}
