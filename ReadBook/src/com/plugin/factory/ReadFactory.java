package com.plugin.factory;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.plugin.config.Config;
import com.plugin.ui.ReadUI;
import org.jetbrains.annotations.NotNull;

/**
 * @Classname ReadFactory
 * @Description TODO
 * @Date 2022/4/2 15:54
 * @Created by daihuhu
 */
public class ReadFactory implements ToolWindowFactory {

    private ReadUI readUI = new ReadUI();
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        // 获取内容工厂的实例
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        // 获取 ToolWindow 显示的内容
        Content content = contentFactory.createContent(readUI.getComponent(), "", false);
        // 设置 ToolWindow 显示的内容
        toolWindow.getContentManager().addContent(content);
        Config.readUI = readUI;
    }
}
