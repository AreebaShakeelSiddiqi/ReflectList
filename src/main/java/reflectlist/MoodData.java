package reflectlist;

import java.util.ArrayList;
import java.util.Collections;

public class MoodData {

    // ================= Ayat Lists =================
    public static ArrayList<String> happyAyat = new ArrayList<>();
    public static ArrayList<String> sadAyat = new ArrayList<>();
    public static ArrayList<String> anxiousAyat = new ArrayList<>();
    public static ArrayList<String> stressedAyat = new ArrayList<>();
    public static ArrayList<String> excitedAyat = new ArrayList<>();
    public static ArrayList<String> angryAyat = new ArrayList<>();
    public static ArrayList<String> lonelyAyat = new ArrayList<>();
    public static ArrayList<String> depressedAyat = new ArrayList<>();
    public static ArrayList<String> gratefulAyat = new ArrayList<>();
    public static ArrayList<String> frustratedAyat = new ArrayList<>();

    // ================= Dua Lists =================
    public static ArrayList<String> happyDua = new ArrayList<>();
    public static ArrayList<String> sadDua = new ArrayList<>();
    public static ArrayList<String> anxiousDua = new ArrayList<>();
    public static ArrayList<String> stressedDua = new ArrayList<>();
    public static ArrayList<String> excitedDua = new ArrayList<>();
    public static ArrayList<String> angryDua = new ArrayList<>();
    public static ArrayList<String> lonelyDua = new ArrayList<>();
    public static ArrayList<String> depressedDua = new ArrayList<>();
    public static ArrayList<String> gratefulDua = new ArrayList<>();
    public static ArrayList<String> frustratedDua = new ArrayList<>();

    // ================= Static Block =================
    static {

        // ================= Happy =================
        happyAyat.add("فَاذْكُرُونِي أَذْكُرْكُمْ\nSo remember Me; I will remember you. (2:152)");
        happyAyat.add("وَإِذَا سَأَلَكَ عِبَادِي عَنِّي فَإِنِّي قَرِيبٌ\nI am near. (2:186)");
        happyAyat.add("إِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");
        happyAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");
        happyAyat.add("وَجَعَلْنَا مِنَ الْمَاءِ كُلَّ شَيْءٍ حَيٍّ\nAnd We made from water every living thing. (21:30)");

        happyDua.add("اللَّهُم لك الحمد كله\nO Allah, all praise is for You");
        happyDua.add("الحمد لله على كل حال\nAll praise is for Allah in every situation");
        happyDua.add("اللهم اجعل قلبي شاكرًا\nO Allah, make my heart grateful");
        happyDua.add("اللهم اجعلني من السعداء\nO Allah, make me among the happy");
        happyDua.add("اللهم ارزقني السعادة في الدنيا والآخرة\nO Allah, grant me happiness in this life and the next");

        // ================= Sad =================
        sadAyat.add("فَإِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");
        sadAyat.add("قُل لَا تَيْأَسُوا مِن رَّحْمَةِ اللَّهِ\nDo not despair of Allah's mercy. (39:53)");
        sadAyat.add("إِنَّ اللَّهَ مَعَ الصَّابِرِينَ\nIndeed, Allah is with the patient. (2:153)");
        sadAyat.add("فَاصْبِرْ صَبْرًا جَمِيلًا\nSo be patient with gracious patience. (70:5)");
        sadAyat.add("وَلَا تَقْنَطُوا مِن رَّحْمَةِ اللَّهِ\nAnd never lose hope in the mercy of Allah. (39:53)");

        sadDua.add("اللهم إني أعوذ بك من الحزن\nO Allah, I seek refuge in You from sadness");
        sadDua.add("ربنا اكفنا ما همنا\nO Lord, protect us from our worries");
        sadDua.add("اللهم اجعل الحزن بعيدًا عن قلبي\nO Allah, remove sadness from my heart");
        sadDua.add("اللهم اجعل الصبر جميلًا\nO Allah, make patience beautiful for me");
        sadDua.add("اللهم ارزقني السكينة\nO Allah, grant me tranquility");

        // ================= Anxious =================
        anxiousAyat.add("إِنَّ اللَّهَ مَعَ الَّذِينَ اتَّقَوْا وَالَّذِينَ هُم مُّحْسِنُونَ\nIndeed, Allah is with those who fear Him and do good. (16:128)");
        anxiousAyat.add("وَاصْبِرْ وَمَا صَبْرُكَ إِلَّا بِاللَّهِ\nAnd be patient, your patience is only with Allah. (16:127)");
        anxiousAyat.add("وَلَا تَقْنَطُوا مِن رَّحْمَةِ اللَّهِ\nDo not despair of the mercy of Allah. (39:53)");
        anxiousAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");
        anxiousAyat.add("وَتَوَكَّلْ عَلَى اللَّهِ\nAnd rely upon Allah. (3:159)");

        anxiousDua.add("اللهم اهدني ووفقني\nO Allah, guide me and grant me success");
        anxiousDua.add("رب اجعل لي من لدنك نصيرا\nO Lord, grant me help from You");
        anxiousDua.add("اللهم أرح قلبي من القلق\nO Allah, ease my anxious heart");
        anxiousDua.add("اللهم اجعلني مطمئنًا\nO Allah, make me calm and content");
        anxiousDua.add("اللهم اجعل اليقين في قلبي\nO Allah, make certainty in my heart");

        // ================= Stressed =================
        stressedAyat.add("وَاصْبِرْ وَمَا صَبْرُكَ إِلَّا بِاللَّهِ\nAnd be patient, your patience is only with Allah. (16:127)");
        stressedAyat.add("إِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");
        stressedAyat.add("وَاعْبُدُوا رَبَّكُمْ حَتَّى يَأْتِيَكُمُ الْيَقِينُ\nWorship your Lord until certainty comes. (15:99)");
        stressedAyat.add("وَإِذَا قِيلَ لَهُمْ لَا تُفْسِدُوا فِي الْأَرْضِ\nAnd when it is said to them, do not cause corruption in the land. (7:56)");
        stressedAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");

        stressedDua.add("اللهم اجعل قلبي مطمئنًا\nO Allah, make my heart peaceful");
        stressedDua.add("اللهم ارزقني القوة\nO Allah, grant me strength");
        stressedDua.add("اللهم اجعل همي فرجًا\nO Allah, relieve my stress");
        stressedDua.add("اللهم اجعل قلبي مطمئنًا برضاك\nO Allah, make my heart content with Your will");
        stressedDua.add("اللهم اجعل يومي مباركًا\nO Allah, bless my day");

        // ================= Excited =================
        excitedAyat.add("وَمَا تَفَجَّرَتِ الأَنْهَارُ وَالنَّجُومُ\nAnd He has made rivers and stars. (16:10)");
        excitedAyat.add("وَإِنَّكَ لَعَلَى خُلُقٍ عَظِيمٍ\nAnd indeed, you are of great moral character. (68:4)");
        excitedAyat.add("وَسَخَّرْنَا لَكُم مَّا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ\nWe have made everything in heavens and earth subservient to you. (45:13)");
        excitedAyat.add("إِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");
        excitedAyat.add("وَتَعَاوَنُوا عَلَى الْبِرِّ وَالتَّقْوَى\nAnd cooperate in righteousness and piety. (5:2)");

        excitedDua.add("اللهم اجعلني دائمًا سعيدًا\nO Allah, make me always happy");
        excitedDua.add("اللهم اجعل قلبي متفائلًا\nO Allah, make my heart optimistic");
        excitedDua.add("اللهم اجعل سعادتي دائمة\nO Allah, make my happiness everlasting");
        excitedDua.add("اللهم اجعل يومي مباركًا\nO Allah, bless my day");
        excitedDua.add("اللهم اجعلني ممتنًا لنعمك\nO Allah, make me grateful for Your blessings");

        // ================= Angry =================
        angryAyat.add("وَاسْتَعِينُوا بِالصَّبْرِ وَالصَّلَاةِ\nAnd seek help through patience and prayer. (2:45)");
        angryAyat.add("وَلَا تَسْتَوِي الْحَسَنَةُ وَلَا السَّيِّئَةُ\nNot equal are the good deed and the evil deed. (41:34)");
        angryAyat.add("فَاصْبِرْ صَبْرًا جَمِيلًا\nSo be patient with gracious patience. (70:5)");
        angryAyat.add("وَالَّذِينَ صَبَرُوا وَتَوَكَّلُوا عَلَى اللَّهِ\nAnd those who are patient and rely on Allah. (3:17)");
        angryAyat.add("إِنَّمَا يُوَفَّى الصَّابِرُونَ أَجْرَهُمْ بِغَيْرِ حِسَابٍ\nIndeed, the patient will be rewarded without measure. (39:10)");

        angryDua.add("اللهم اجعل غضبي خيرًا\nO Allah, make my anger for good");
        angryDua.add("اللهم اجعل قلبي هادئًا\nO Allah, make my heart calm");
        angryDua.add("اللهم اجعل صبري طويلًا\nO Allah, increase my patience");
        angryDua.add("اللهم اجعلني من الصابرين\nO Allah, make me among the patient");
        angryDua.add("اللهم اجعل قلبي مطمئنًا برضاك\nO Allah, make my heart content with Your will");

        // ================= Lonely =================
        lonelyAyat.add("وَاصْبِرْ وَمَا صَبْرُكَ إِلَّا بِاللَّهِ\nAnd be patient, your patience is only with Allah. (16:127)");
        lonelyAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");
        lonelyAyat.add("إِنَّ اللَّهَ مَعَ الصَّابِرِينَ\nIndeed, Allah is with the patient. (2:153)");
        lonelyAyat.add("وَتَوَكَّلْ عَلَى اللَّهِ\nAnd rely upon Allah. (3:159)");
        lonelyAyat.add("رَبِّ إِنِّي مَغْلُوبٌ فَانْصُرْنِي\nMy Lord, indeed I am overcome, so help me. (7:128)");

        lonelyDua.add("اللهم اجعل قلبي مطمئنًا\nO Allah, make my heart peaceful");
        lonelyDua.add("اللهم اجعلني قريبًا من أحبتي\nO Allah, keep me close to my loved ones");
        lonelyDua.add("اللهم أرح قلبي\nO Allah, ease my heart");
        lonelyDua.add("اللهم اجعلني سعيدًا رغم وحدتي\nO Allah, make me happy despite being alone");
        lonelyDua.add("اللهم ارزقني الصحبة الطيبة\nO Allah, grant me good companionship");

        // ================= Depressed =================
        depressedAyat.add("فَإِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");
        depressedAyat.add("قُل لَا تَيْأَسُوا مِن رَّحْمَةِ اللَّهِ\nDo not despair of Allah's mercy. (39:53)");
        depressedAyat.add("إِنَّ اللَّهَ مَعَ الصَّابِرِينَ\nIndeed, Allah is with the patient. (2:153)");
        depressedAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");
        depressedAyat.add("فَاصْبِرْ صَبْرًا جَمِيلًا\nSo be patient with gracious patience. (70:5)");

        depressedDua.add("اللهم اجعل قلبي مطمئنًا\nO Allah, make my heart peaceful");
        depressedDua.add("اللهم أرح قلبي\nO Allah, ease my heart");
        depressedDua.add("اللهم اجعل الصبر في قلبي\nO Allah, make patience in my heart");
        depressedDua.add("اللهم اجعلني سعيدًا برضاك\nO Allah, make me happy with Your will");
        depressedDua.add("اللهم ارزقني القوة\nO Allah, grant me strength");

        // ================= Grateful =================
        gratefulAyat.add("وَاذْكُرُوا نِعْمَتَ اللَّهِ عَلَيْكُمْ\nRemember Allah's blessings upon you. (5:11)");
        gratefulAyat.add("فَاذْكُرُونِي أَذْكُرْكُمْ\nSo remember Me; I will remember you. (2:152)");
        gratefulAyat.add("وَجَعَلْنَا مِنَ الْمَاءِ كُلَّ شَيْءٍ حَيٍّ\nAnd We made from water every living thing. (21:30)");
        gratefulAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");
        gratefulAyat.add("إِنَّ مَعَ الْعُسْرِ يُسْرًا\nIndeed, with hardship comes ease. (94:6)");

        gratefulDua.add("اللهم اجعل قلبي شاكرًا\nO Allah, make my heart grateful");
        gratefulDua.add("اللهم اجعلني من الشاكرين\nO Allah, make me among the grateful");
        gratefulDua.add("اللهم زدني حبًا فيك\nO Allah, increase my love for You");
        gratefulDua.add("اللهم اجعل يومي مباركًا\nO Allah, bless my day");
        gratefulDua.add("اللهم اجعلني ممتنًا لنعمك\nO Allah, make me thankful for Your blessings");

        // ================= Frustrated =================
        frustratedAyat.add("فَاصْبِرْ صَبْرًا جَمِيلًا\nSo be patient with gracious patience. (70:5)");
        frustratedAyat.add("وَاسْتَعِينُوا بِالصَّبْرِ وَالصَّلَاةِ\nAnd seek help through patience and prayer. (2:45)");
        frustratedAyat.add("وَلَا تَسْتَوِي الْحَسَنَةُ وَلَا السَّيِّئَةُ\nNot equal are the good deed and the evil deed. (41:34)");
        frustratedAyat.add("إِنَّمَا يُوَفَّى الصَّابِرُونَ أَجْرَهُمْ بِغَيْرِ حِسَابٍ\nIndeed, the patient will be rewarded without measure. (39:10)");
        frustratedAyat.add("أَلَا بِذِكْرِ اللَّهِ تَطْمَئِنُّ الْقُلُوبُ\nIndeed, in the remembrance of Allah do hearts find rest. (13:28)");

        frustratedDua.add("اللهم اجعل قلبي مطمئنًا\nO Allah, make my heart peaceful");
        frustratedDua.add("اللهم اجعل صبري طويلًا\nO Allah, increase my patience");
        frustratedDua.add("اللهم اجعل همي فرجًا\nO Allah, relieve my worries");
        frustratedDua.add("اللهم اجعل قلبي هادئًا\nO Allah, make my heart calm");
        frustratedDua.add("اللهم اجعلني من الصابرين\nO Allah, make me among the patient");
    }

    // ================= Random Selector =================
    public static String getRandom(ArrayList<String> list) {
        if (list.isEmpty()) return "";
        Collections.shuffle(list);
        return list.get(0);
    }
}
