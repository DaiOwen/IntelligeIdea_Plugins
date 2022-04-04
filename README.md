# IntelligeIdea_Plugins 说明
**介绍**：IDEA 插件开发可以帮助研发人员提升能效，解决一些实际场景中的共性问题，平时在开发工作中，我们也经常使用各种各样的IDEA插件，比如Lombak、Codata等。最近也想着自己开发一个插件，但是插件的流程不太熟，市面的资料确实不多，也没有成体系完整的开发指导手册，所以就遇到了很多不知道就不会的事情，需要一点点查询搜索源码、验证API接口，最终把各项功能实现，这个确实挺痛苦的，最终找到了“bugstack 虫洞栈”的一篇文章，就尝试着搭建了下，在这里将自己的经验分享给大家。

**开发插件涉及的问题**
![image](https://user-images.githubusercontent.com/39590385/161005894-f8f50331-6469-4a4f-8d2a-5df1b76f2f64.png)
**1、开发方式**：在官网的描述中，创建IDEA插件工程的方式有两种分别是，IntelliJ Platform Plugin 模版创建和 Gradle 构建方式。

**2、框架入口**：一个 IDEA 插件开发完，要考虑把它嵌入到哪，比如是从 IDEA 窗体的 Edit、Tools 等进入配置还是把窗体嵌入到左、右工具条还是IDEA窗体下的对话框。

**3、UI**：思考的是窗体需要用到什么语言开发，没错，用的就是 Swing、Awt 的技术能力。

**4、API**：在 IDEA 插件开发中，一般都是围绕工程进行的，那么基本要从通过 IDEA 插件 JDK 开发能力中获取到工程信息、类信息、文件信息等。

**5、外部功能**：这一个是用于把插件能力与外部系统结合，比如你是需要把拿到的接口上传到服务器，还是从远程下载文件等等

（**参考文章**：[IDEA插件开发](https://bugstack.cn/md/assembly/idea-plugin/2021-08-27-技术调研，IDEA 插件怎么开发？.html)）

最终效果展示：
1、demo展示（主要实现点击当前类，当取当前类的信息）
![image](https://user-images.githubusercontent.com/39590385/161045623-9b6c6a02-5028-4f46-9500-d72db3fc17e0.png)
![image](https://user-images.githubusercontent.com/39590385/161045692-3e675f0e-b34c-4090-8c0e-f3c5fd081061.png)

2、《文档速览》插件（将文档迅速倒入idea,进行读取，一边开发、一边读取文档，不再反复切换软件）

![image](https://user-images.githubusercontent.com/39590385/161471088-5295aee7-cc18-4e34-9a7e-b35a753e0b5e.png)
![image](https://user-images.githubusercontent.com/39590385/161471089-34cf3d92-48b9-4da5-b142-2abe4e557700.png)

