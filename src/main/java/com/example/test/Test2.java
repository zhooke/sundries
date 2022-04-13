package com.example.test;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * @author zhouhd
 * @since 2021/10/18 16:59
 **/
public class Test2 {

    public static void main(String[] args) {
        String str ="{\"program\":[{\"id\":\"1806569\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F15820763260030a65c5679d11b26d7e41438eaafe4l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F15820763260030a65c5679d11b26d7e41438eaafe4l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F15820763260030a65c5679d11b26d7e41438eaafe4l.mp3\"}],\"duration\":\"330\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-19\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"30.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806569\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806568\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076272abbb6fcb74a693cfce7dea4d5fe65a3el.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076272abbb6fcb74a693cfce7dea4d5fe65a3el.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076272abbb6fcb74a693cfce7dea4d5fe65a3el.mp3\"}],\"duration\":\"586\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-19\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"30.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806568\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806567\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076262c89617c762413141930994366d537836l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076262c89617c762413141930994366d537836l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F19%2F1582076262c89617c762413141930994366d537836l.mp3\"}],\"duration\":\"21\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-19\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"30.1君子喻于利（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806567\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806566\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138719633f22fcd4997bb031b8bc35e42a26cfdl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138719633f22fcd4997bb031b8bc35e42a26cfdl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138719633f22fcd4997bb031b8bc35e42a26cfdl.mp3\"}],\"duration\":\"406\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-11\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"29.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806566\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806565\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F15813871336c7ea800ba9fb234d03bec0794c2d1bfl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F15813871336c7ea800ba9fb234d03bec0794c2d1bfl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F15813871336c7ea800ba9fb234d03bec0794c2d1bfl.mp3\"}],\"duration\":\"613\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-11\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"29.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806565\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806564\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138711544cfabf9fe8307bcec1c19a740e2cdcfl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138711544cfabf9fe8307bcec1c19a740e2cdcfl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F11%2F158138711544cfabf9fe8307bcec1c19a740e2cdcfl.mp3\"}],\"duration\":\"36\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-11\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"29.1不患无位（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806564\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806563\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895904d53e3895f29add6cfc65ed2673ae7b07l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895904d53e3895f29add6cfc65ed2673ae7b07l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895904d53e3895f29add6cfc65ed2673ae7b07l.mp3\"}],\"duration\":\"324\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-05\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"28.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806563\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806562\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F158089585131beae37929362c09e21633b80284edel.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F158089585131beae37929362c09e21633b80284edel.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F158089585131beae37929362c09e21633b80284edel.mp3\"}],\"duration\":\"577\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-05\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"28.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806562\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806561\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895839ad127d78fa79f1b8ebbfb313720f9f54l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895839ad127d78fa79f1b8ebbfb313720f9f54l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F02%2F05%2F1580895839ad127d78fa79f1b8ebbfb313720f9f54l.mp3\"}],\"duration\":\"17\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-10\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"28.1放于利而行（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806561\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806560\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375736ad7b7360447c95bf39092138e70e74fdl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375736ad7b7360447c95bf39092138e70e74fdl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375736ad7b7360447c95bf39092138e70e74fdl.mp3\"}],\"duration\":\"472\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-30\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"27.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806560\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806559\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F15803756827f1ac8d9f242b132accd35043f564499l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F15803756827f1ac8d9f242b132accd35043f564499l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F15803756827f1ac8d9f242b132accd35043f564499l.mp3\"}],\"duration\":\"568\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-30\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"27.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806559\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806558\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375669ed8156d3a25dbb3cb4ba0eb64b056de7l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375669ed8156d3a25dbb3cb4ba0eb64b056de7l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F30%2F1580375669ed8156d3a25dbb3cb4ba0eb64b056de7l.mp3\"}],\"duration\":\"27\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-10\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"27.1士志于道（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806558\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806557\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F158011867839ea5e36c3c1a95544f1e8d9b3b806bcl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F158011867839ea5e36c3c1a95544f1e8d9b3b806bcl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F158011867839ea5e36c3c1a95544f1e8d9b3b806bcl.mp3\"}],\"duration\":\"417\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-27\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"26.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806557\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806556\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118626785574b511a135af04eb21f833503200l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118626785574b511a135af04eb21f833503200l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118626785574b511a135af04eb21f833503200l.mp3\"}],\"duration\":\"584\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-27\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"26.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806556\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806555\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118616775a116c66b6d6f1507c345cd7f23867l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118616775a116c66b6d6f1507c345cd7f23867l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F27%2F1580118616775a116c66b6d6f1507c345cd7f23867l.mp3\"}],\"duration\":\"22\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-02-10\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"26.1朝闻道夕死可矣（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806555\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806554\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F157960039256399d73eabb54bcee183c93f9189f05l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F157960039256399d73eabb54bcee183c93f9189f05l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F157960039256399d73eabb54bcee183c93f9189f05l.mp3\"}],\"duration\":\"471\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-21\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"25.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806554\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806553\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600342bc8b794cbfa1b99b4ec88865473afd40l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600342bc8b794cbfa1b99b4ec88865473afd40l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600342bc8b794cbfa1b99b4ec88865473afd40l.mp3\"}],\"duration\":\"579\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-21\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"25.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806553\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806552\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600331f3913d6b20e1c3ab332028f831ec8e20l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600331f3913d6b20e1c3ab332028f831ec8e20l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F21%2F1579600331f3913d6b20e1c3ab332028f831ec8e20l.mp3\"}],\"duration\":\"78\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-21\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"25.1富与贵（中英诵读）\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806552\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806551\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144396dd6c3fcae5b28511b8c484b37b80904dl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144396dd6c3fcae5b28511b8c484b37b80904dl.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144396dd6c3fcae5b28511b8c484b37b80904dl.mp3\"}],\"duration\":\"345\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-16\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"24.3斯老师英文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806551\",\"downloadUrl\":\"\",\"playNum\":\"0\"},{\"id\":\"1806550\",\"podcaster\":\"\",\"type\":\"\",\"podcasterId\":\"\",\"podcasterIcon\":\"\",\"anchorNames\":\"\",\"streams\":[{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144341036e32df5c7fd3a23bd79be6ae9731b2l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144341036e32df5c7fd3a23bd79be6ae9731b2l.mp3\"},{\"bitstreamType\":\"0\",\"resolution\":\"0\",\"url\":\"http:\\/\\/ytmedia.radio.cn\\/CCYT%2F2020%2F01%2F16%2F1579144341036e32df5c7fd3a23bd79be6ae9731b2l.mp3\"}],\"duration\":\"524\",\"programWord\":\"\",\"size\":\"\",\"shareNum\":\"0\",\"imageUrl\":[{\"size\":\"big\",\"url\":\"\"},{\"size\":\"middle\",\"url\":\"\"},{\"size\":\"small\",\"url\":\"\"}],\"onlinetime\":\"2020-01-16\",\"description\":\"\",\"keyword\":\"\",\"mp3Url\":\"\",\"mp3Length\":\"\",\"shareUrl\":\"\",\"odChannelIds\":\"1707251\",\"mp3Size\":\"\",\"name\":\"24.2何老师中文讲解\",\"time\":\"\",\"collectNum\":\"0\",\"programId\":\"1806550\",\"downloadUrl\":\"\",\"playNum\":\"0\"}]}";
        JSONObject jsonObject = JSONUtil.parseObj(str);
        JSONArray program = jsonObject.getJSONArray("program");

        for (int i = 0; i < program.size(); i++) {
            //从第1个开始，去除第0个
            JSONObject jsonObject1 = program.getJSONObject(i);
            JSONArray streams = jsonObject1.getJSONArray("streams");
            String url = streams.getJSONObject(0).getStr("url");
            String name = jsonObject1.getStr("name");
            System.out.println(i+"---"+name+"---"+url);
        }
    }
}