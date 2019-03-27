# AndroidShell
Android 加壳保护

运行流程
1. 编译源工程的debug版本source.apk
2. 编译壳工程的debug版本unshell.apk，解压得到classes.dex
3. 运行加壳工程，输入source.apk和unshell.apk的classes.dex，输入一个加壳后的new-classes.dex
4. 使用apktool工具，解包unshell.apk，并用new-classes.dex替换classes.

   解包：java -jar apktool.jar d -f -s unshell.apk
5. 使用apktool工具，重新打包unshell.apk，得到new-unshell.apk

   打包：java -jar apktool.jar b unshell
6. 对new-unshell.apk进行重签名

   重签名：
   
    i、ii步骤是生成证书，如已有证书，直接跳到第iii步骤进行签名
    1)  keytool -genkey -v -keystore debug.keystore -alias androiddebugkey -keyalg RSA -validity 10000
    2)  keytool -importkeystore -srckeystore debug.key store -destkeystore newdebug.keystore -deststoretype pkcs12
    3)  jarsigner -verbose -keystore newdebug.keystore -storepass andrd -keypass android -signedjar unshell_signed.apk  unshell.apk androiddebugkey
