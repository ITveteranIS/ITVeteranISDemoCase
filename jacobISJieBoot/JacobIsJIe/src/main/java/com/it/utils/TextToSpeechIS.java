package com.it.utils;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComFailException;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TextToSpeechIS {
    public static void textToSpeech(String text) throws Exception {
        ActiveXComponent ax = null;
        try {
            ax = new ActiveXComponent("Sapi.SpVoice");
            // 运行时输出语音内容
            Dispatch spVoice = ax.getObject();
            // 音量 0-100
            ax.setProperty("Volume", new Variant(100));
            // 语音朗读速度 -10 到 +10(-10语速最慢，10语速最快)
            ax.setProperty("Rate", new Variant(1));
            /*  执行朗读，默认调用系统中的TTS语音播放引擎，若本机没有语音设备
            可能会抛出异常(com.jacob.com.ComFailException: Invoke of: Speak) */
            Dispatch.call(spVoice, "Speak", new Variant(text));
            spVoice.safeRelease();
            ax.safeRelease();
        } catch (ComFailException e) {
            throw new Exception("没有可用的音频，请连接外接设备(耳机或音箱播放)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
