package com.idea4j.jvm.jsoup.collectappname;

import com.google.common.collect.Lists;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.util.UriTemplate;

import javax.print.Doc;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.L;

/**
 * Created by markee on 2016/10/24.
 */
public class CollectRobot {
    public static void main(String[] args) throws IOException {
        //http://appstore.huawei.com/search/%E9%87%91%E8%9E%8D%E7%90%86%E8%B4%A2/1
        //String str = "http://appdlc.hicloud.com/dl/appdl/application/apk/ec/ec0c88786c3841cf8dc113ddb0cb0d80/com.wukonglicai.app.1610141812.apk?sign=portal@portal1477284361908&source=portalsite";
        //List<String> list = Lists.newArrayList("玖富钱包","平安金管家","陆金所","京东金融","蚂蚁聚宝","微众银行","易付宝钱包","爱钱进理财","恒大金服","呱呱财经","人人贷WE理财","有利网理财","联币金融","平安财富宝","宜人理财","荷包","点融理财","中融投","挖财宝理财","积木盒子","你我贷理财","小牛在线","储蓄罐","网信理财","PP理财","钱大掌柜","拍拍贷理财","多盈理财","铜板街理财","翼龙贷","懒财网理财","凤凰金融","红包摇摇","草根投资","现金宝","招财猫理财","百度理财","360你财富","投融家理财","网贷之家","君融贷","投哪网理财","简理财","财神爷爷","鑫合汇理财","真融宝","鲸鱼宝理财","甜橙理财","口袋理财","开心贷","聚财猫理财","小树时代","洋钱罐理财","搜狐搜易贷理财","盈盈理财","钱牛牛","草根钱包","小盈理财","祺天优贷","唐小僧理财","小金理财","指旺理财","爱投资","邮乐金融","恒易融理财","小资钱包","网贷天眼","投客理财","惠金所","金蛋理财","黄金钱包","天弘爱理财");
        //List<String> list = Lists.newArrayList("Wind资讯金融终端","大象保险","和讯期货","平安保险精选","网易贵金属","银天下*贵金属","宁波银行直销银行","信达天下","汇通财经","微盘宝","公积金查询","太平洋保险精选","中国太保","一账通平安汇","众筹","中海金融交易","口袋贵金属","原油宝","金大师","沃百富","中国邮币卡","E动生命","众安","同花顺炒股票","牛股王股票","易阳指","投投金融","优顾炒股","股先生","神财分析师","东方财富网","大智慧","广发证券易淘金","涨乐财富通","天天基金网","平安证券","e海通财","51公积金管家","智远一户通","金太阳","雪球股票","银河玖乐","宗易汇","广发手机证券","小方","申万宏源高端","大智慧经典版","自选股","中信建投手机证券通用版","安心手机证券","同花顺股票账户","光大金阳光","万得股票","益盟操作手经典版","掌中投","东方财富通HD","新浪财经","中泰齐富通","格上基金","模拟炒股票","优品股票通","炒股票入门","掌上基金","通达信","佣金宝","益盟操盘手加强版","爱投顾股票","中信建投证券","信E投","指南针股票","华彩人生（新版）","掌证宝","南京证券大智慧","Wind资讯金融终端","中银国际","换手率","财通证券","投资赢家","民生证券","京东股票","信达同花顺","东吴秀财","宏源天游","东海通","金贝壳手机证券智慧版","股票雷达","广发证券开户","同花顺爱基金","国泰君安开户","优理宝","慧金融","浪客直播","淘股吧","百度股市通","爱股轩","金罗盘","平安自助开户","浙商汇金谷","股吧","老虎股票","新时代证券","玖乐2.0","华夏基金管家","佣金宝开户","金太阳掌厅","大通证券","西南金点子","智能选股王","股涨通","中信建投","和讯股票","华龙点金","东吴证券同花顺","华西股票开户","富途牛牛","嘉实理财嘉","经传软件","华福证券掌乐","火币比特币","广州证券6.1","恒泰金玉管家","策略炒股通","灯塔","恒泰掌财","一创财付通","同花顺i问财选股","牛股宝模拟炒股票","股市热点","天风股票开户","东海龙点金","股市教练","太平洋证券","股票入门基础知识","股票先机炒股软件","K线学霸","买卖时机","麻袋理财","广发基金","融e通","金贝壳","蛋卷基金理财","中信证券炫酷版","万联大智慧","南方基金","翼阳指","红塔证券手机炒股票软件","数米基金宝","国联尊宝","慧博投资分析","益起学炒股","全能行","公牛炒股","新时代通达信","和讯基金","股小量","股票卫士","牛仔网","网易财经","FDT操盘手","股票短线王","招商手机开户","金融界","中金财经","全民淘股","西南证券智慧版","操盘英雄","模拟炒股","鑫财通","财富证券开户","私募汇","好股互动","交易宝","金太阳国际","富国富钱包","仙人掌股票","黄金外汇行情","中山证券","华福掌乐","易选股","看盘宝","操盘训练神器","方正证券开户","会牛","浙商证券开户","长江E开户","易开户","老牛选股","南京证券同花顺","中泰融易开户","每日一股炒股票","理财通","中银证券开户","期货操盘手","博时基金","禾商所","益盟操盘手HD","华股财经","蛋蛋股票","兴业全球基金","开源手机证券","财来啊","中国新三板","开源证券象道","牛人汇","中泰融易理财","淘股池短线炒股","股票行情","大连再生","中山赢者","股票直播室","财道","胜算在握股票","51信用卡管家","卡牛信用卡管家","个人征信查询","中银易商","平安橙子","融360信用卡","挖财信用卡管家","招商银行信用卡办卡","平安银行信用卡办卡","征信查询","外币兑换CURRANCYFX","翼支付","银联钱包","京东钱包","百度钱包","拉卡拉钱包","和包","拉卡拉收款宝","快钱钱包","速刷理财版","沃钱包","掌上热力","掌钱","瓜牛钱包","开发票","本元支付","商联通付","收银+","易付宝商户版","点钱包","易收钱","小红理财","90贵金属","挖财记账理财","随手记","天天记账本","网易有钱","微记账","圈子账本记账","口袋记账","timi记账","口袋记账本","随手记账","随身记账本","简易记账本","可萌记账","分期管家","记账账本","愿望记账","记账管家","松鼠记账","记账有道云笔记","9188记账","简易家庭记账本","中国银行信用卡办卡","记账软件","发票通","个人小账本","笨笨记账本","安心记工","财务记账","帐王","掌上工资条","天天记账","个人记账","有鱼记账","挖财记账理财pad版","懒人记账","财智快账","智慧家庭记账软件","同花顺投资账本","51来呗","记账理财","点帐","随手记旅游版","记账工具","生意如何","多多记账","财鱼管家","手机记账","逸记","随时记账本","微店加","管账宝","小时工记账","管理宝","理财记账","外汇微盘宝","钱客多","记账账务小管家","DD记账","采宝","仓鼠账本","财猪记账","记账本","大车管家","boss查账","大树微商","账单小二","账单日","超级支付","经营宝","中投摩根","记托付","欧冶金管家","票友邦","说记","易店长","口袋恒指","蓝窗店管家","秒账","花多少","智理财","信用卡记账管家","点金棒","工猫管家","创赢房管家","房贷计算器","记加班","贷款计算器","倒班助手","社保公积金查询","财新","华尔街见闻","chinadaily","金十数据","21世纪经济报道","国务院","第一财经","和讯财经","环球time","seed","有看投","ft中文网","财联社","get资讯","选股宝","央视财经","快讯通财经","财经头条","和新闻","经济日报","证券时报","摩尔金融","商界","时代财经","fx168财经","财经网","财神道","财经","商业周刊","哈佛商业评论","第一财经周刊+","财新周刊","红周刊");
        //List<String> list = Lists.newArrayList("chrome浏览器 ","欧朋浏览器","opera","私密浏览器","海豚浏览器旋风版","天际通","平安车载wifi","wifi全球游","象鼻子wifi宝","i-pudong","中华万年历","万年历日历","墨迹天气","天气通","2345天气预报","中央天气预报","中华万年历","老黄历万年历日历","365日历","最美天气","中华老黄历","天气","倒数日","万年历日历吉历","彩云天气","空气质量","全国空气质量","指南针","灵犀语音助手","华为文件管理","云视通","teamviewer","微关爱家人手机定位","美名滕智能宝宝起名","宝宝取名起名","掌上看家","北京儿童医院","爱今天","深圳居住证","时间表","今日提醒","e提醒","蛋蛋","知乎","blued","豆瓣","她社区","一直播","花粉俱乐部","简书","天涯社区","facebook","易班","领英","google+","脉脉","zank","住这儿","lesdo","兴趣部落","暖青汇","分答","互动吧","赤兔","弈客围棋","钓鱼人","tumblr","snapchat","曝工资","百合婚恋","世纪佳缘","珍爱网","marryu相亲征婚","百合相亲","gmail","coremail","inbox","千牛","旺信","有信电话","易信","skype","messenger","微话 ","连我line","viber","twitter","爱智学","京东咚咚商家版","集团通讯录","商务通讯录","每日一题*腰果公考","有道精品课","网易公开课","粉笔公考","中国大学mooc","教师资格证","知鸟","微课掌上通","会计从业资格证随身学","慕课网","教师资格证随身学","会计移动课堂","砖题库公务员","会计从业万题库","小木虫","豆丁书房","会计帮","口袋会计从业资格考试","华图在线","2017公务员考试","瑞达法考","伴读","好家长","公务员万题库","融学","厚大司考","51cto学院","优蓓通","会计从业题库","医生站","法律数据库","尚德机构","教师资格证备考","医学时间","MBA智库百科","考试宝典","百词斩","英语流利说","阿卡索口语秀","51talk无忧英语","学为贵雅思","金山词霸","扇贝单词","每日英语听力","扇贝新闻","bbc双语新闻","扇贝口语","多说英语","掌中英语","不背单词","bbc六分钟英语","cnn双语新闻","ted英语演讲","朗易思听","有道口语大师","小站雅思","德语助手","google翻译","医药学大词典","拍译全能王","有道云笔记","wps office","云之家","口袋助理","钉钉","扫描全能王","讯飞语记","pdf阅读器","名片全能王","microsoft excel","印象笔记（evernote）","office办公套件","企查查企业信用查询","启信宝企业信用查询","Microsoft powerpoint","office mobile","麦库记事本","纷享销客","随手写","今目标","和彩云","集团彩云","滴答清单","随笔记","onenote","w3 mobile","zine","思维简图","为知笔记","pdf reader","彩色便签","清单日程计划表到点","阿里卖家","移动经纪人","高效todo","万能记事本","withme日记本隐私","外勤365","番茄todo","领航备忘录","skypeforbusiness","calender","3A思维导图","设计宝","wps邮箱","officesuite","人脉通","全球速卖通","红圈营销","总机服务","mindjet maps","工作圈","any.do日程管理","小移人家","脉可讯名片","印象便签","名片扫描王","高效率nfc","易信","简易便签","思维整理mindly","寻客","保险家","喔趣考勤","teambition","e税客","日事清","jiffy时间管理","谷歌云打印","记事本","多多记事本","微办公","华为手机学院","保险神器","加密云盘","ami记事本","worktile","清单-有道云笔记","好团队oa","微名片","阳光人社","115+","daygram","拉勾企业版","直脉","生意街","长江联合","妙笔","程序员客栈","阿里法律","58车商通","商标进度查询","明道","微链","客户管家","100%目标","36氪创投助手","eteams","掌阅ireader","qq阅读","咪咕阅读","书旗小说","畅读书城","书香免费小说","白熊阅读","阅读王","追书神器","搜狗阅读","华为阅读","微信读书","荣耀阅读","熊猫看书","爱读掌阅","当当读书","快听小说","亚马逊kindle","网易云阅读","移动图书馆","爱阅读","京东阅读","豆瓣阅读","开卷小说","潇湘书院","豆腐","都市言情小说","凤凰书城","欢乐书客","黑岩阅读","苏宁阅读","当当阅读","看书神器","静读天下","奇悠阅读","磨铁阅读","十个","阅读星HD","酷匠轻小说","掌中书城","疯狂追书","阅读星","九库阅读","故事会官方正版","红薯阅读","新浪阅读","轻文轻阅读","人人阅读","芝士阅读","看山","竞彩猫","超阅小说","完美追书","若初文学","原创书殿","读览天下","阅读神器","书海","迅雷阅读","新闻期刊大全","晒书房","黄小米读书","首都图书馆","4g阅读","畅想阅读","淘宝阅读","三味书屋","听云中书城","梦想书城","青果阅读","鲜果读书","魅力磨合","乐阅","三味书屋","花生故事","书香园区","科幻世界","品读","博思阅读","若夏文学","阅书中文","书呆子","北新读书","小步读书","书问阅读","艾美阅读","文献云阅读","半糖阅读","偶家","闲读","最美阅读","蜜阅书苑","党媒头条","九阅文学","书入法","多近借书","云图","嗨阅","上海观察","北京时间","凤凰新闻","得到","一点资讯","虎扑体育","人民日报","央视新闻","zaker新闻","全球未解之谜","澎湃新闻","好奇心日报","河南日报","知乎日报","军事头条","太平洋汽车网","汽车头条","东方头条","viva畅读","新华社","参考消息","界面","南方周末","头条快报","uc头条","米尔军事","卡车之家","中国新闻网","极客快讯","36氪","即刻","奇点资讯","微博头条","铁血军事","中央纪委网站","新车评","汽车之家论坛","创业邦","粉丝网","凤凰新闻HD","看看新闻","好看","手机人民网","搜狐汽车","橘子娱乐","浙江新闻","天涯日报","中华军事","南方周末","爱青岛","爱玩","虎嗅","本地头条","汽车头条","观察者","light","长江云","军事tv","读读日报","数字尾巴","超野e族","战略军事","央广新闻","无线梅州","甬派","智慧青岛","微信头条","掘金","时刻新闻","微信头条","体育头条","抽屉新热榜","传阅头条","疆来","山东24小时","云上黄冈","交汇点新闻","微商","并读","新华炫闻","推酷","创意设计","壹深圳","新湖南","煎蛋","南京文交所","电商新闻","掌上武汉","迷彩虎军事","中国农业平台","中国经济","爱济南","头条军事","中国武警","足球比分","凤凰头条","听闻","建业足球","半岛","微头条","直播日照","智慧长沙","钛媒体","新闻和天气","都市频道","荔枝新闻","南都","光明云媒","新福建","爱范儿","青岛新闻","中搜搜悦","知亦行","生物谷","资讯阅读器","南海网","点看宁波","热门话题","前端","无线济南","十堰头条","鲜闻","今日热点","华商播报","懒人听书","氧气听书","起点读书","酷我听书fm","有声小说","酷听听书","咪咕听书","为你诵读","掌阅听书","樊登读书会","听书听报","蜻蜓挺熟","爱听听书","天行听书","路上读书","一路听书","爱播听书","一说","书香苏州","听世界听书","广播剧bl","悦耳听书","音乐故事","传奇听书","去听","多看阅读","ted演讲","一个","中国国家地理","读者","时尚志","hot男人","flipboard","单读","杂志汇","故事会","青年文摘","zealer","男士衣饰搭配","vogue mini","人言","一刻","格知guechi","时尚芭莎best","网易时尚杂志","iweekly","心情","elle","听见","elleplus","ideat理想家","有读故事","看电影","服饰美容","南周知道","悦己self","sci期刊助手","艺术与文化","ellemen","华夏地理-yoka出品","青提文献","米娜","智惠阅读","黑马创业邦","蜘蛛书厅报","葛小姐","gq24","优资讯","蜘蛛精","变美志","zaker橱窗","闺蜜圈","胡润超微","沃杂志","此时此刻","广而告之","果觅","呈现","南方人物周刊","茶马古道");
        //List<String> list = Lists.newArrayList("户外助手","waze","个人二手车","户外帮","奥维互动地图","google街景","mapsme","韩国地图","稀客地图","一家民宿","越南地图","新加坡地图","清迈中文地图","大阪离线地图","马拉西亚地图","环球旅游地图","thailandmap","京都离线地图","beonroad","印尼地图","新西兰地图","南京奔驰管家","北海道离线地图","mytransport","定制路书管家","悉尼地图","奈良离线地图","福冈离线地图","沙特阿拉伯地图","巴塞罗那地图","桩点","优步-uber","滴滴司机","一嗨租车","租租车","e代驾","摩拜单车","神州专车","优步车主端","易到","易到车主端","神州租车","嘀嗒拼车","货拉拉","58速运","首汽约车","货车帮","曹操专车","爱代驾","宝驾出行","首汽租车","快快租车","盼达用车","悟空租车","51用车","瑞卡租车","惠租车","小二租车","aa租车","易开租车","小鸟房车","友友用车","lfyt","平安代驾","95128约车","我有车","豪咖","蜗壳房车","谊车汇美泊","小马跨境车","tripadvisor猫头鹰","要出发周边游","马蜂窝自由行","天巡旅行","出国翻译官","周末去哪儿","上海迪斯尼度假区","穷游","三毛游","极简汇率","旅图","亲自年票","行程助手","行者","在外_旅行户外驴友活动","里程管家","出国旅游英语","穷游锦囊","穷游最世界","魔房","链景旅行","马蜂窝商城","花瓣旅行","小日子","旅行箱","游侠客","面包旅行","口袋导游","tourtalk译游","韩游网","marriott","氢气球旅行","钓友会","彩贝壳","出发吧","自驾旅游","麦淘亲子","骑行助手","购轻松台湾","行咖","亲子周末","世界邦行程大师","常客","求攻略自由行","日本旅游攻略","结伴游","破风骑行","咖游韩国","云游日本pro","日本旅游","游谱旅行","迪士尼套餐","谷歌旅行","熊猫签证","最云南","放假周边游","妙计旅行","宝贝走天下","四万公里","登山越岭","周末去哪儿玩","优游日本","travelzoo","骏途旅游","玩赚世界","东京离线地图","窝友之家","海玩-海外吃喝玩乐购","行啊","io定制游","杰西卡的秘密","uu客","旅咖","旅游日语","行鸽旅游","指南猫旅行","七洲自由行","笨游","途遥旅行","爱去","8只小猪","济州岛自由行攻略","面包自由行","溜溜地球","出发台湾","嗨钓app","airbnb","酒店预订","自如","agoda安可达","维也纳酒店","ihg优悦会","蚂蚁房东助手","我享度假","hhonors","自在客","沙发旅行","鹰漠旅行","开元商祺会","台湾民宿神器","漫酒店","逸柏酒店","喊你玩","韩国酒店114","别处","韩国地铁","yahoo乘换案内","地铁香港通","日本地铁","东京地铁","新加坡地铁","moovit公交","首尔地铁","韩国地铁","香港换乘","台湾换乘","台湾等公车","母婴之家","贝贝母婴正品特卖","d2c","寺库奢侈品","higo海淘代购全球购","天然工坊","乐友-母婴商城，妈妈首选","走秀-奢侈品","有调","豆瓣东西","想去","美囤妈妈","屠夫买车","全球旅拍","爱拼宝宝","车车联盟","康众汽配","中国化工电商","好车驿栈","网易考拉海购","洋码头","菠萝蜜全球购","美美香美妆","蜜惠-日淘购物","达令全球好货","珍品网","必有","丰趣海淘","海淘","云猴全球购","环球捕手","ssam","嗨淘全球","汽车导购","什么值得买","okeydokey","要买车","果库","新车推介","悦享","亲宝宝","宝宝树孕育","妈妈帮","妈妈社区","妈咪知道","美柚","大姨吗","宝宝知道","大姨妈","柚宝宝孕育","孕育管家","宝宝树小时光","崔玉涛育学园","怀孕期妈妈必备","辣妈帮","妈妈网","孕期提醒","更美","健康养生","食物派","keep","悦动圈","糖豆广场舞","咪咕善跑","U运动","咕咚","华为穿戴","乐动力","春雨计步器","华为运动健康","悦跑圈跑步","动动","乐心运动","多锐运动","行者骑行","fit","fittime","荣耀畅玩手环","虎扑跑步","火辣健身","美趣减肥瘦身","up","健身宝典","体记忆运动健康","feel","美寸减肥","weloop","郑多燕健身操视频","轻+","黑鸟单车","nike+running","瘦瘦","广场舞多多","乐跑步","点点运动","全民广场舞","哥本哈根减肥","fitbit","硬派健身","运动管家","美骑","野兽骑行","云高高尔夫","boss直聘","拉勾","linkdinjobsearch","人人猎头","滴一猎头","周伯通招聘","猎上","医疗人才网","北森italent","杰客","演员圈","链家","链家-上海苏州","安居客","平安好房","悟空找房","诸葛找房","房天下","我爱我家","爱屋吉屋","搜房帮","租房帮","住房公积金查询","家家顺房产网","理房通","房贷计算器","安个家二手房","中原地产","丁丁租房","搜狐购房助手","透明房产网","新浪二手房","9188公积金","乐居二手房","房贷计算器","掌上好房通","房产超市","房价点评","麦田在线","云燕安家","铺铺旺","107间","房主儿租房","找房","房江湖","中国房价","透明家","新房帮","兔博士","zillow","城市房产","珍房网","米宅","房贷计算器","二手房交易网","互助卖房","优优好房","搜铺","真二网","吉屋","真房网","28商机","51社保管家","591房屋交易","房东利器","木鸟房东助手","好好租房东版","房旺旺","空间家","海外有家","蘑菇伙伴","房途网","新房天下","惠买房","去买房","房地产估价","房专家","包租婆","搜办写字楼","快有家","富力好房","香港楼市","51买房","知房*售房宝","南京二手房","快找办公室","58按揭","房洽洽","房地产平台","智地数据","智屋交易","买房吗","亲戚买房","星巴克","yhouse","红酒世界","土巴兔装修","惠装装修","蜗牛装修","最美装修","装修图库","乐橙","酷家乐装修","好好住","丽芙家居","齐家","土拨鼠装修","装修设计","icolor","设计家装修","大神养车","汽车报价","汽车报价大全","汽车超人","途虎养车","车主无忧","全国违章查询","违章查询");
        //List<String> list = Lists.newArrayList("thailand map","lfyt","乐友-母婴商城，妈妈首选","屠夫买车","okey dokey","咕咚","linkdin job search","房主儿租房","最美装修","汽车报价大全");
        //List<String> list = Lists.newArrayList("中国建设银行 ","招商银行 ","中国工商银行 ","工银融e联 ","农行掌上银行 ","中国银行 ","邮储银行 ","掌上生活 ","交通银行 ","网商银行 ","浦发手机银行 ","民生银行 ","平安口袋银行 ","光大银行 ","中国银行 ","华夏银行 ","江苏银行 ","北京银行 ","宁波银行 ","上海银行 ","南京银行 ","兴业银行" );
        //List<String> list = Lists.newArrayList("支付宝","华为支付","小花钱包");
        //List<String> list = Lists.newArrayList("自选股 ","新浪财经 ","佣金宝 ","爱投顾股票 ","换手率 ","股吧 ","财新 ","华尔街见闻 ","china daily ","21世纪经济报道 ","第一财经 ","和讯财经 ","财经头条 ","经济日报 ","财经网 ","挖财记账理财 ","随手记 ","网易有钱 ","圈子账本记账 ","口袋记账 ","timi记账 ","财鱼管家" );

        //List<String> list = Lists.newArrayList("换手率 ","股吧 ","财新 ","华尔街见闻 ","china daily ","21世纪经济报道 ","第一财经 ","和讯财经 ","财经头条 ","经济日报 ","财经网 ","挖财记账理财 ","财鱼管家" );
        List<String> list = Lists.newArrayList("小赢理财","金蛋理财","团贷网","指望理财");
        for (String name: list  ) {
            try {
                Document doc = Jsoup.connect("http://appstore.huawei.com/search/" + URLEncoder.encode(name) + "/1").get();
                //System.out.println(doc.text());
                Elements e = doc.select(".app-btn a");
                //System.out.println(e.attr("onclick").toString());
                String onclick = e.attr("onclick").toString();
                String url = onclick.split(",")[5];
                //System.out.println(url);
                //String url2 = "'http://appdlc.hicloud.com/dl/appdl/application/apk/ec/ec0c88786c3841cf8dc113ddb0cb0d80/com.wukonglicai.app.1610141812.apk?sign=portal@portal1477286789628&source=portalsite'";
                UriTemplate u = new UriTemplate("'http://appdlc.hicloud.com/dl/appdl/application/apk/{cate}/{code}/{appname}?{ddd}'");
                Map<String, String> map = u.match(url);
                String appname = map.get("appname");
                //System.out.println(url);
                System.out.println(name + ":" + appname);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}