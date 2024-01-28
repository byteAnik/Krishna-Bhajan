
package com.anik.krishnabhajan;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("UCf_rTpRx3w", "প্রদীপ পাল নতুন কীর্তন গান 2021 |", " Pradip Pal Kirtan |");
		addVideoItem("2KB2pzTtY9M", "প্রদীপ পাল নতুন কীর্তন |", "pradip pal new kirtan song 2023 |");
		addVideoItem("lwF8aYr0bOQ", "তুলসী মালা পড়ে এই ভুল কাজগুলো করবেন না !", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("eZVbM1wPLTA", "২০২৩ এর নতুন ভাইরাল তত্ত্বকথা প্রদীপ পাল ", "[pradip pal kirtan new 2023] ");
		addVideoItem("lN2xsio5uD4", "শ্রাবণ মাস স্পেশাল ১৪৩০", " pradip pal kirtan 2023");

		addVideoItem("o03TvamTsws", "সংসারে কখনও অর্থের অভাব হবে না ", " Pradip Pal Kirtan |");
		addVideoItem("FMNXN-WiUh8", "প্রদীপ পাল নতুন কীর্তন |", "pradip pal new kirtan song 2023 |");
		addVideoItem("PNsNX3F7KBU", "সাত সকালে এই ভুল গুলি করবেন না! |", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("y8nF61HVrK0&t=2s", "কালী পূজার পাঠা বলি করা কী ঠিক ", "[pradip pal kirtan new 2023] ");
		addVideoItem("oEvQgNKcrGE", "প্রদীপ পাল নতুন কীর্তন ১৪৩০", " pradip pal kirtan 2023");

		addVideoItem("kAOYFVEQuoI", "যেমন কর্ম তেমন ফল প্রমাণ দেখুন, সমাজ শিক্ষা প্রদীপ পাল ", " Pradip Pal Kirtan |");
		addVideoItem("aMI9SDyU01g", "যে ভুলের জন্য সংসারে উন্নতি নেই ! ", "pradip pal new kirtan song 2023 |");
		addVideoItem("RVVxBlDGSO8&t=5s", "কীর্তনটি শুনে হাজারো ভক্ত কেঁদে পাগল ! ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("3YcNX-M8QtU", "প্রদীপ পালের এই কীর্তন টি না শুনলে মানব জীবন বৃথা হয়ে যাবে  ", "[pradip pal kirtan new 2023] ");
		addVideoItem("cDSzpQ7_0Z0", "দান কোথায় করবেন ? সম্পূর্ণ নতুন তত্ব কথা |", " pradip pal kirtan 2023");

		addVideoItem("eqvMBG9SrW4", "যপ্রদীপ পাল নতুন কীর্তন ", " Pradip Pal Kirtan |");
		addVideoItem("JZt7sVCKmdM", "প্রদীপ পাল নতুন কীর্তন  ", "pradip pal new kirtan song 2023 |");
		addVideoItem("HxcR0VMz0EI", "অহংকারী মানুষের পতন হবেই প্রমাণ দেখুন, প্রদীপ পাল কীর্তন 2022 ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("LjJkgWm2thc", "প্রদীপ পাল নতুন কীর্তন |  ", "[pradip pal kirtan new 2023] ");
		addVideoItem("Z4ias6dRgMA", "তুলসী গাছ শুকিয়ে গেলে সংসারে কি ক্ষতি হয় ?", " pradip pal kirtan");

		addVideoItem("WGGc4A9DAeY", "মানুষের মনে আজ সুখ নেই কেন?  ", " Pradip Pal Kirtan |");
		addVideoItem("MxKZeCDjfpk", "কলিযুগের ভবিষ্যৎ বাণী ভগবান শ্রীকৃষ্ণ নিজের মুখে বললেন  ", "pradip pal new kirtan song 2023 |");
		addVideoItem("lmAPU-2bQXw&t=2203s", "জন্মাষ্টমী স্পেশাল কীর্তন !  ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("a7SSJ2JfIxg", "প্রদীপ পাল নতুন কীর্তন |  ", "[pradip pal kirtan new 2023] ");
		addVideoItem("y0svPas_94o", "যারা বেশি চিন্তা করেন তারা এটা দেখুন প্রদীপ পাল কীর্তন", " pradip pal kirtan");


		addVideoItem("MxKZeCDjfpk", "কলিযুগের ভবিষ্যৎ বাণী ভগবান শ্রীকৃষ্ণ নিজের মুখে বললেন  ", "pradip pal new kirtan song 2023 |");
		addVideoItem("lmAPU-2bQXw&t=2203s", "জন্মাষ্টমী স্পেশাল কীর্তন !  ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("a7SSJ2JfIxg", "প্রদীপ পাল নতুন কীর্তন |  ", "[pradip pal kirtan new 2023] ");
		addVideoItem("y0svPas_94o", "যারা বেশি চিন্তা করেন তারা এটা দেখুন প্রদীপ পাল কীর্তন", " pradip pal kirtan");

		addVideoItem("45ZAzRXK7qo", "প্রদীপ পাল নতুন কীর্তন ", "pradip pal new kirtan song 2023 |");
		addVideoItem("oHg60RQjcBU&t=3s", "প্রদীপ পাল নতুন কীর্তন ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("e4mwopiV0Zo", "প্রদীপ পাল নতুন কীর্তন |  ", "[pradip pal kirtan new 2023] ");
		addVideoItem("3946zeFOZ0s", "প্রদীপ পাল নতুন কীর্তন", " pradip pal kirtan");

		addVideoItem("3946zeFOZ0s", "প্রদীপ পাল নতুন কীর্তন ", "pradip pal new kirtan song 2023 |");
		addVideoItem("T4x2q-7oU4A", "প্রদীপ পাল নতুন কীর্তন ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("rTtAuvEyx-0", "অম্বুবাচী চলাকালীন ভুলেও এই কাজগুলি করবেন না", "[pradip pal kirtan new 2023] ");
		addVideoItem("QBLgw3akv8s", "নতুন তত্ত্বকথা ! প্রদীপ পাল কীর্তন 2023 ", " pradip pal kirtan");

		addVideoItem("XjDkZ4YQfi4", "প্রদীপ পাল নতুন কীর্তন ", "pradip pal new kirtan song 2023 |");
		addVideoItem("p_lad4b82kU", "প্রদীপ পাল নতুন কীর্তন ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("qcKZ3H2qfaY", "স্নান যাত্রা স্পেশাল", "[pradip pal kirtan new 2023] ");
		addVideoItem("gQxcrnf1A-4", "নতুন তত্ত্বকথা ! প্রদীপ পাল কীর্তন 2023 ", " pradip pal kirtan");
		addVideoItem("pV9KujaSob8", "প্রদীপ পাল নতুন কীর্তন ", "pradip pal new kirtan song 2023 |");
		addVideoItem("mXYySqWhuQE", "প্রদীপ পাল নতুন কীর্তন ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("751s", "অম্বুবাচী চলাকালীন ভুলেও এই কাজগুলি করবেন না", "[pradip pal kirtan new 2023] ");
		addVideoItem("3wgISBdkgN8", "নতুন তত্ত্বকথা ! প্রদীপ পাল কীর্তন 2023 ", " pradip pal kirtan");

		addVideoItem("JPD3na6bFz0", "প্রদীপ পাল মদ ও মাতালদের নিয়ে কি বললেন", "pradip pal new kirtan song 2023 |");
		addVideoItem("zWcprNBOQD4", "১৯ বছর পর শ্রাবণ মাস মল মাস ।। শ্রাবণ মাসের সোমবারের মাহাত্ম্য কি", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("EpOakuuG-1g", "এই মন্ত্র জব করুন | অগ্রহায়ণ মাস স্পেশাল", "[pradip pal kirtan new 2023] ");
		addVideoItem("AeblRub4vuM", "নতুন তত্ত্বকথা ! প্রদীপ পাল কীর্তন 2023 ", " pradip pal kirtan");
		addVideoItem("89zf6xTdP2w", "প্রদীপ পাল নতুন কীর্তন ", "pradip pal new kirtan song 2023 |");
		addVideoItem("pul5o8Jgh0U", "প্রদীপ পাল নতুন কীর্তন ", "প্রদীপ পাল কীর্তন তত্ত্বকথা");
		addVideoItem("59M2bJKo8n8", "বিয়ের কার্ডে শুভ বিবাহ লিখবেন না ", "[pradip pal kirtan new 2023] ");
		addVideoItem("ZiqRoMrO6qk", "নতুন তত্ত্বকথা ! প্রদীপ পাল কীর্তন 2023 ", " pradip pal kirtan");


		createPlayList("প্রদীপ পাল", R.drawable.category_1);
		//==========================================================================

		//==========================================================================
		addVideoItem("FSwdA9TQjw4", "মঙ্গল আরতি ইসকন", "Iskcon");
		addVideoItem("Beff1j6vO60", "জয় শ্রী কৃষ্ণ|| বৃন্দাবনবাসী যত বৈষ্ণবের গণ||বৈষ্ণব বন্দনা||", "JAY SHREE KRISHNA|| KIRTAN ||");
		addVideoItem("2nzgDj2CLcw", "Iskcon Bhajans | Namah Namah Tulsi |", "Iskcon Prabhati Aarti");
		addVideoItem("LBXajbKy32U", "Hari Haraye Namah | Iskcon Bhajan |", "Hare Krishna ");
		addVideoItem("lArX_cnBMlo", "Iskcon Bhajan | Namaste Narasimhaya |", "Hare Krishna ");

		addVideoItem("JAEDDy_DTlQ", "Sri Guru Vandana", "Iskcon");
		addVideoItem("KMStYf3_SG0", "জয় শ্রী কৃষ্ণ|| বৃন্দাবনবাসী যত বৈষ্ণবের গণ||বৈষ্ণব বন্দনা||", "JAY SHREE KRISHNA|| KIRTAN ||");
		addVideoItem("2nzgDj2CLcw", "পঞ্চতত্ত্ব বন্দণা নিতাই গৌর", "krishnabhajan");
		addVideoItem("YmJIvtHAahA", "Sri Guru Charana Padma, Guru Puja", "Hare Krishna ");
		addVideoItem("fLz4mrIR1no", "Gour Arati", "Hare Krishna ");

		addVideoItem("SVuY8bfzbgM", "Samsara davanala (iskcon morning aarti) ||", "Iskcon");
		addVideoItem("kC8lAxQoL0w", "Iskcon Bhajans | Sonshar Dabanol | ", "JAY SHREE KRISHNA|| KIRTAN ||");
		addVideoItem("MtjLQiewNtQ", "Iskcon Bhajan |নমস্তে নরসিংহায়", "krishnabhajan");



		createPlayList("আরতি কীর্তন", R.drawable.category_2);
		//==========================================================================


		//==========================================================================
		addVideoItem("JLz7VcIYRVQ", "নাচেরে নাচেরে নিতাই, গৌর দ্বিজ মনিয়া ", "Nache Re Nache Re Nitai");
		addVideoItem("jTK0b6qYfo0", "Daulat Shohrat Kya Karni", "Daulat Shohrat Kya Karni | Kailash Kher | Audio Song");
		addVideoItem("wha_UC_tqGM", "Gaaye Gora Madhur Sware", "Tera Naam Dhoka Rakh Du");
		addVideoItem("IYbHe0R3Pqs", "Jar Mukhe Bhai Hori Kotha Nai Tar Kace Tumi Jeona", "Hare Krishna ");
		addVideoItem("iJvJ_0XpkJE", "Gauranga Bolite Habe", "Hare Krishna ");

		addVideoItem("AKfFeimNFgs", "জয় রাধামাধব জয় কুঞ্জবিহারী ", "Hare Krishna");
		addVideoItem("UqMUf7bubw8", "ওহে বৈষ্ণব ঠাকুর দয়ার সাগর এ দাসেরে করুণা করি", "Hare Krishna");
		addVideoItem("y3gyPi-Ra04", "Yasomati Nandana", "Hare Krishna");
		addVideoItem("Xkz5ihSWG5s", "নাচে শচী নন্দন সং", "Hare Krishna ");
		addVideoItem("mICEJPDRkgA", "ভজ গৌরাঙ্গ কহ গৌরাঙ্গ লহ গৌরাঙ্গের নাম রে", "Hare Krishna ");

		addVideoItem("D5LjbBjamTs", "Hori Haraye Nama Krishna ", "Hare Krishna");
		addVideoItem("7p1RQXsnD70", "Brojo Gopi Khele Hori", "Hare Krishna");
		addVideoItem("qNC2ymZ8yTc", "মম অন্তর মন্দিরে জাগো জাগো, মাধব কৃষ্ণ গোপাল ", "Hare Krishna");
		addVideoItem("IFzAAicfm5w", "আমি নামের ভিখারী দ্বারে দ্বারে ভিক্ষা", "Hare Krishna ");
		addVideoItem("SAEhcFJrZk", "ওঠো ওঠো নন্দলাল চেয়ে দেখো হলো সকাল ", "Hare Krishna ");
		createPlayList("ভক্তি গীতি", R.drawable.category_3);
		//==========================================================================


		//==========================================================================
		addVideoItem("jyWs3K80ZC0", "কে ছিলেন শ্রীচৈতন্য মহাপ্রভু?", "তাঁর সংক্ষিপ্ত জীবনী জানুন ");
		addVideoItem("cV1DQcImRxA", "চৈতন্য মহাপ্রভুর লীলা চৈতন্য চরিতামৃত পাঠ", "Hare Krishna");
		addVideoItem("2xI9KCIe604", "কে ছিলেন শ্রী চৈতন্য মহাপ্রভু", "Hare Krishna");
		addVideoItem("AxiMFUVkjxM", "জগাই মাধাই উদ্ধার", "jagai madhai story in bengali");
		addVideoItem("1sS1uvywBaE", "ভোরের নগর কীর্তন ", "হরে কৃষ্ণ");

		addVideoItem("X25wZ3L8Plo", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু ১ - প্রস্তাবনা", "হরে কৃষ্ণ ");
		addVideoItem("c0s-EeckCME", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - ভূমিকা | ২য় পাঠ | ১ম ভাগ\n", "Hare Krishna");
		addVideoItem("xsMK6nH5NtA", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - ভূমিকা | ২য় পাঠ | ২য় ভাগ", "Hare Krishna");
		addVideoItem("hXhgn5fl6WA", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ১ ", "Hare Krishna");
		addVideoItem("GxaY5TG8c6g", " ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ২ ", "হরে কৃষ্ণ");

		addVideoItem("sgBc9tteygQ", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু ১ - অধ্যায় ৩", "হরে কৃষ্ণ ");
		addVideoItem("aMH3ZksIP2k", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ৪-৫", "Hare Krishna");
		addVideoItem("rSAZ3x8N5oY", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ৬-৮", "Hare Krishna");
		addVideoItem("lPVV0INtLWQ", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ৯-১০ ", "Hare Krishna");
		addVideoItem("kcMgQuYsBXM", " ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ১১-১৪ ", "হরে কৃষ্ণ");

		addVideoItem("t8rlJTvIQkM", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ১৫-১৬ ", "হরে কৃষ্ণ ");
		addVideoItem("pFcoVvMjX2U", "ভক্তিশাস্ত্রী - ভক্তিরসামৃত সিন্ধু - অধ্যায় ১৭-১৯", "Hare Krishna");



		createPlayList("হরি কথা", R.drawable.category_4);
		//==========================================================================

		//==========================================================================
		addVideoItem("78blvfZ8upI", "The Story Of A Dedicated Soul - HH Jayapataka Swami !", "Hare Krishna");
		addVideoItem("b5JkBIPLDTI", "জয়পতাকা মহারাজের সঙ্গে অতিবাহিত সময়ের স্মৃতিচারণ", "Hare Krishna");
		addVideoItem("5YuY33c2pgU", "শ্রীল গুরুদেবের অলৌকিক জীবন কাহিনী", "Hare Krishna");
		addVideoItem("yagWOms0yHE", "শ্রীল জয়পতাকা স্বামী মহারাজের ইসকনে যোগদান এবং সন্ন্যাস গ্রহণের কাহিনী  ", "Hare Krishna");
		addVideoItem("BRaGVtfw3Ik", "Jayapataka Swami gave a Bengali S.B. lecture in Mayapur", "Hare Krishna ");

		addVideoItem("5ZFLovjFBYQ", "Iskcon sandhya aarti | Sri Guru Charanapaddma | Hare Krishna", "Hare Krishna");
		addVideoItem("b5JkBIPLDTI", "জয়পতাকা মহারাজের সঙ্গে অতিবাহিত সময়ের স্মৃতিচারণ", "Hare Krishna");
		addVideoItem("JE3p6bwChHc", "ভগবান কে? | Who is God? | By H.H. Bhakti Charu Swami Maharaja", "Hare Krishna");
		addVideoItem("jiTivg3dSkw", "Jayapataka Swami Guru Maharaj  ", "Hare Krishna");
		addVideoItem("zwPKWDifYmM", "Jayapataka Swami gave a Bengali S.B. lecture in Mayapur", "Hare Krishna ");

		addVideoItem("zwPKWDifYmM", "নতুন দীক্ষাপ্রার্থীদের উদ্দেশ্যে শ্রীল জয়পতাকা স্বামী মহারাজের হৃদয়স্পর্শী বার্তা", "Hare Krishna");
		addVideoItem("wc9TdCF5FZ4", "Hare Krishna Festival 2023 - His Holiness Jayapataka Swami", "Hare Krishna");
		addVideoItem("r2p7VkVREyk", "Never Give Up - Jayapataka Swami", "Hare Krishna");
		addVideoItem("X9Qcuvsl92Q", "গৃহস্থ ভক্তদের প্রতি শ্রীল জয়পতাকা স্বামী মহারাজের উপদেশ  ", "Hare Krishna");
		addVideoItem("dm0bXkqcwjU", "A TRIBUTE TO SRILA JAYAPATAKA SWAMI MAHARAJA", "Hare Krishna ");

		addVideoItem("lOnaKjLfJrY", "হাল ছাড়বেন না - শ্রীল জয়পতাকা স্বামী", "Hare Krishna");
		addVideoItem("w_4Gqwgz_JE", "জয়পতাকা স্বামী মহারাজের জন্মস্থানের রহস্য", "Hare Krishna");
		addVideoItem("aohYBt5eelA", "শ্রীল জয়পতাকা স্বামী প্রণাম মন্ত্র II গুরু প্রণাম মন্ত্র", "Hare Krishna");

		createPlayList("শ্রী শ্রীমৎ জয়পতাকা স্বামী জীবনী", R.drawable.category_5);
		//==========================================================================


		//==========================================================================
		addVideoItem("H2i8lvy_Jj4", "শ্রীল প্রভুপাদের সম্পূর্ণ জীবনী", "Hare Krishna");
		addVideoItem("lYD6W45UTxU", "ইসকন কিভাবে প্রতিষ্ঠিত হয়েছিল জেনে নিন", "Hare Krishna");
		addVideoItem("5YuY33c2pgU", "শ্রীল গুরুদেবের অলৌকিক জীবন কাহিনী", "Hare Krishna");
		addVideoItem("sx7dx5cJ_nI", "ধর্ম কি? শ্রীল প্রভুপাদ কি বলেছেন  ", "Hare Krishna");
		addVideoItem("7HzFlop_a14", "শ্রীল প্রভুপাদের কন্ঠে চৈতন্য চরিতামৃত পাঠ শ্রবণ করুন", "Hare Krishna ");

		addVideoItem("k0btILfLJEE", "কে এই শ্রীল প্রভুপাদ? ", "Hare Krishna");
		addVideoItem("dJkP1CkhTrI", "বর্তমান সময়ের কিছু বাস্তব সমস্যা", "Hare Krishna");
		addVideoItem("EzxhE1tTGRE", "প্রভুপাদ এর বাংলা প্রবচন", "Hare Krishna");
		addVideoItem("dx8Ke_d5uhk", "ধর্ম কি? শ্রীল প্রভুপাদ কি বলেছেন  ", "Hare Krishna");

		addVideoItem("dx8Ke_d5uhk", "অন্য দেব-দেবতা থেকে আমরা কি পাই আর কৃষ্ণ আমাদের কি দেয় ", "Hare Krishna");
		addVideoItem("xugL21iLcwk", "মায়াপুরে নৃসিংহ দেব কিভাবে এলেন", "Hare Krishna");
		addVideoItem("8f1-dhZlrDE", "শ্রীল প্রভুপাদের সঙ্গে ভক্তিচারু মহারাজের ব্যক্তিগত অভিজ্ঞতার স্মৃতিচারণ", "Hare Krishna");
		addVideoItem("yEVwX4bIOPE", "কৃষ্ণকে লাভ করতে চাইলে কোন কোন অপরাধ করা যাবেনা  ", "Hare Krishna");

		addVideoItem("FHZX4eaLzd8", "কামদাস না শ্রীকৃষ্ণদাস প্রভুপাদের বাংলা প্রবচন ", "Hare Krishna");
		addVideoItem("Hm9N6P9phiA", "শ্রীল প্রভুপাদ এর সাথে শ্রীকৃষ্ণের সাক্ষাৎ", "Hare Krishna");
		addVideoItem("ysUJDywSLGg", "প্রভুপাদ এর দিব্য কন্ঠে বাংলা প্রবচন।। ৩", "Hare Krishna");
		addVideoItem("yXZ2oB2SBAI", "শ্রীল প্রভুপাদের বাংলা লেকচার  ", "Hare Krishna");

		addVideoItem("bF9BWyGHH1I", "শাস্ত্রে কী সত্যিই মাংস খেতে বলা হয়েছে ", "Hare Krishna");
		addVideoItem("mpJF7BX_B", "সহজে ভক্ত হওয়ার উপায় বললেন শ্রীল প্রভুপাদ", "Hare Krishna");
		addVideoItem("1BSfS9RUxDI", "যখন একটি ভয়ংকর কুকুর শ্রীল প্রভুপাদকে আক্রমণ করেছিল", "Hare Krishna");
		addVideoItem("lGMMy0r2gww", "আমি মারা যাচ্ছি না || শ্রীল প্রভুপাদ বাংলা প্রবচন  ", "Hare Krishna");

		addVideoItem("knJM3MV5eRw", "প্রভুপাদ কেন ৭০ বছর বয়সে আমেরিকায় গিয়ে ইসকন প্রতিষ্ঠা করেছিলেন ", "Hare Krishna");
		addVideoItem("xkjN8S7L560", "শ্রীল প্রভুপাদ এর সাথে শ্রীকৃষ্ণের সাক্ষাৎ", "Hare Krishna");
		addVideoItem("0i4kazBA7bw", "শ্রীল প্রভুপাদের ৮ টি দিব্য লীলা", "Hare Krishna");
		addVideoItem("dJkP1CkhTrI", "বর্তমান সময়ের কিছু বাস্তব সমস্যা ", "Hare Krishna");
		createPlayList("অভয়চরণারবিন্দ ভক্তিবেদান্ত স্বামী প্রভুপাদ জীবনী", R.drawable.category_6);
		//==========================================================================

		//==========================================================================
		addVideoItem("s1sRdPc2FJc", "শ্রীমদ্ভগবদ্গীতা - প্রথম অধ্যায় - সংশয়-বিষাদ যোগ ", "Srimad Bhagavad Gita Bangla Chapter 1");
		addVideoItem("r3HU62vMOeo", "শ্রীমদ্ভগবদ্গীতা - যথার্থ গীতা - দ্বিতীয় অধ্যায় - কর্মজিজ্ঞাসা ", "Bhagavad Gita Bangla Chapter 2");
		addVideoItem("eT5wnguAn3U", "শ্রীমদ্ভগবদ্গীতা - তৃতীয় অধ্যায় - শত্রুবিনাশ প্রেরণাা", " Srimad Bhagavad Gita in Bengali Chapter 3");
		addVideoItem("DVZjW9DFv3Y", "শ্রীমদ্ভগবদ্গীতা - চতুর্থ অধ্যায় - যজ্ঞকর্ম স্পষ্টীকরণ ", " Bhagavad Gita in Bangla - Chapter 4");

		addVideoItem("WzpTCbmvgAU", "শ্রীমদ্ভগবদ্গীতা - পঞ্চম অধ্যায় - যজ্ঞভোক্তা মহাপুরুষস্থ মহেশ্বর ", "Bhagavad Gita Bangla, Chapter 5");
		addVideoItem("vqg8Ooqqt34", "শ্রীমদ্ভগবদ্গীতা - ষষ্ঠ অধ্যায় - অভ্যাস যোগ ", "Bhagavad Gita Bangla Chapter 6");
		addVideoItem("_7yhQowdsBo", "শ্রীমদ্ভগবদ্গীতা - সপ্তম অধ্যায় - সমগ্র যোগ ", " Srimad Bhagavad Gita in Bengali Chapter 7");
		addVideoItem("NSVu_1G7XyM", "শ্রীমদ্ভগবদ্গীতা - যথার্থ গীতা - অষ্টম অধ্যায় - অক্ষর ব্রহ্মযোগ ", " Bhagavad Gita in Bangla - Chapter 8");

		addVideoItem("xwWx7lY0Js8", "শ্রীমদ্ভগবদ্গীতা - নবম অধ্যায় - রাজবিদ্যা জাগৃতি ", "Srimad Bhagavad Gita Bangla Chapter 9");
		addVideoItem("KnhVFtVwix0", "শ্রীমদ্ভগবদ্গীতা - দশম অধ্যায় - বিভূতি বর্ণন ", "Bhagavad Gita Bangla Chapter 10");
		addVideoItem("yCz4hur6JDU", "শ্রীমদ্ভগবদ্গীতা - একাদশ অধ্যায় - বিশ্বরূপ দর্শন যোগ", " Srimad Bhagavad Gita in Bengali Chapter 11");
		addVideoItem("_oQlPRAe3-A", "শ্রীমদ্ভগবদ্গীতা - দ্বাদশ অধ্যায় - ভক্তিযোগ ", " Bhagavad Gita in Bangla - Chapter 12");

		addVideoItem("RgenRZP_5d8", "শ্রীমদ্ভগবদ্গীতা - ত্রয়োদশ অধ্যায় - ক্ষেত্র-ক্ষেত্রজ্ঞ বিভাগ যোগ ", "Srimad Bhagavad Gita Bangla Chapter 13");
		addVideoItem("B9EKyN7vg08", "শ্রীমদ্ভগবদ্গীতা - চতুর্দশ অধ্যায় - গুণত্রয় বিভাগ যোগ ", "Bhagavad Gita Bangla Chapter 14");
		addVideoItem("bwHFso-A9hE", "শ্রীমদ্ভগবদ্গীতা - পঞ্চদশ অধ্যায় - পুরুষোত্তম যোগ", " Srimad Bhagavad Gita in Bengali Chapter 15");
		addVideoItem("2F9PQrY950g", "শ্রীমদ্ভগবদ্গীতা - ষষ্ঠদশ অধ্যায় - দৈবাসুর সম্পদ্ বিভাগ যোগ ", " Bhagavad Gita in Bangla - Chapter 16");

		addVideoItem("cj2SEhqMWvA", "শ্রীমদ্ভগবদ্গীতা - সপ্তদশ অধ্যায় - ওঁতৎসৎ ও শ্রদ্ধাত্রয় বিভাগ যোগ ", "Srimad Bhagavad Gita Bangla Chapter 17");
		addVideoItem("PXNuCz7MIJM", "শ্রীমদ্ভগবদ্গীতা - অষ্টাদশ অধ্যায় - সন্ন্যাস যোগ ", "Bhagavad Gita Bangla Chapter 18");
		addVideoItem("ZeYlxBwsSN0", "যথার্থ গীতা - উপসংহার ", "Srimad Bhagavad Gita | Bengali | Conclusion");
		createPlayList("শ্রীমদ্ভগবদ্গীতা", R.drawable.category_7);
		//==========================================================================

		addVideoItem("qcH8ps1Umfo", "বেদ - Veda (Bengali) 1| ", "Swami Samarpanananda");
		addVideoItem("gsIUYvSZpxQ", "বেদ - Veda (Bengali) 2| ", "Swami Samarpanananda");
		addVideoItem("M9_jqU9n4Ho", "বেদ - Veda (Bengali) 3 ", "Swami Samarpanananda");
		addVideoItem("AlV59DgIYs4", "বেদ - Veda (Bengali) 4 ", " Swami Samarpanananda");
		addVideoItem("-rKG6fvCjis", "বেদ - Veda (Bengali) 5 ", "Swami Samarpanananda");
		addVideoItem("QD0ep5mKiQE", "বেদ - Veda (Bengali) 6 ", " Swami Samarpanananda");

		addVideoItem("lDadQkF3cNw", "বেদ - Veda (Bengali) 7  ", "Swami Samarpanananda");
		addVideoItem("UTWQM7OUOVI", "বেদ -Veda (Bengali)8 ", "Swami Samarpanananda");
		addVideoItem("iSY6sCku8aA", "বেদ - Veda (Bengali) 9 ", "Swami Samarpanananda");
		addVideoItem("u5a5D1l_tEA", "বেদ - Veda (Bengali) 10 ", " Swami Samarpanananda");
		addVideoItem("YdR7kPQr7kM", "বেদ - Veda (Bengali) 11 ", "Swami Samarpanananda");
		addVideoItem("JmwSa3DnmDg", "বেদ - Veda (Bengali) 12 ", " Swami Samarpanananda");

		addVideoItem("vB7aYKzOkXg", "বেদ - Veda (Bengali) 13| ", "Swami Samarpanananda");
		addVideoItem("JD9RFhn3ZyE", "বেদ - Veda (Bengali) 14| ", "Swami Samarpanananda");
		addVideoItem("XTvoIRsWbmg", "বেদ - Veda (Bengali) 15 ", "Swami Samarpanananda");
		addVideoItem("eKBts3PwcjA", "বেদ - Veda (Bengali) 16 ", " Swami Samarpanananda");
		addVideoItem("QD0ep5mKiQE", "বেদ - Veda (Bengali) 17 ", " Swami Samarpanananda");

		addVideoItem("L0feMY-bGNw", "বেদ - Veda (Bengali) 18  ", "Swami Samarpanananda");
		addVideoItem("YrItEh_Ofao", "বেদ -Veda (Bengali)  19 ", "Swami Samarpanananda");
		addVideoItem("11knsyoRQhI", "বেদ - Veda (Bengali) 20 ", "Swami Samarpanananda");
		addVideoItem("haM6iQIODRU", "বেদ - Veda (Bengali) 21 ", " Swami Samarpanananda");
		addVideoItem("oGqTlsJazlI", "বেদ - Veda (Bengali) 22 ", "Swami Samarpanananda");
		addVideoItem("O7YF1B9y4c8", "বেদ - Veda (Bengali) 23 ", " Swami Samarpanananda");

		addVideoItem("SPxovJ3iT9E", "বেদ - Veda (Bengali) 24| ", "Swami Samarpanananda");
		addVideoItem("yLDk_Om-vs0", "বেদ - Veda (Bengali) 25| ", "Swami Samarpanananda");
		addVideoItem("ABFsygAYaas", "বেদ - Veda (Bengali) 26 ", "Swami Samarpanananda");
		addVideoItem("ls5DE_ZOVgU", "বেদ - Veda (Bengali) 27 ", " Swami Samarpanananda");
		addVideoItem("XvkFt8pfl5E", "বেদ - Veda (Bengali) 28 ", " Swami Samarpanananda");

		addVideoItem("hvjyK2ebMsY", "বেদ - Veda (Bengali) 29  ", "Swami Samarpanananda");
		addVideoItem("byGUf786FT4", "বেদ -Veda (Bengali)  30 ", "Swami Samarpanananda");
		addVideoItem("K6Aci-2-OGw", "বেদ - Veda (Bengali) 31 ", "Swami Samarpanananda");
		addVideoItem("7sFrvLrEqFs", "বেদ - Veda (Bengali) 32 ", " Swami Samarpanananda");
		addVideoItem("oqIz7K-1JBE", "বেদ - Veda (Bengali) 33 ", "Swami Samarpanananda");
		addVideoItem("9v0HRNJLqGE", "বেদ - Veda (Bengali) 34 ", " Swami Samarpanananda");

		addVideoItem("3hGmcYLRIsc", "বেদ - Veda (Bengali) 35  ", "Swami Samarpanananda");
		addVideoItem("qTyVEBgevV0", "বেদ -Veda (Bengali)  36 ", "Swami Samarpanananda");
		addVideoItem("pkJ1TaKpBiQ", "বেদ - Veda (Bengali) 37 ", "Swami Samarpanananda");
		addVideoItem("A5vnpGSlrvY", "বেদ - Veda (Bengali) 38 ", " Swami Samarpanananda");
		addVideoItem("AUuwgK9zvHg", "বেদ - Veda (Bengali) 39 ", "Swami Samarpanananda");
		addVideoItem("VYKvcA5IyUE", "বেদ - Veda (Bengali) 40 ", " Swami Samarpanananda");
		addVideoItem("2w5_CR-lAdY", "বেদ - Veda (Bengali) 41 ", " Swami Samarpanananda");


		createPlayList("বেদ", R.drawable.category_8);
		//==========================================================================

		addVideoItem("sYeWLXCcCKw", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 1  ", " Sri Rama marries Sita | Swami Samarpanananda");
		addVideoItem("EMpqmu2pOEA", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 2 ", "Rama is asked to go to forest | Swami Samarpanananda");
		addVideoItem("n_NtKB4NCxY", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 3 ", "Rama persuades Lakshman to stay calm | Swami Samarpanananda");
		addVideoItem("z4tPYVXdZuw", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 4 ", " Sita forces Sri Rama to take her to the forest");
		addVideoItem("eA9EwnjOgmg", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 5", "Sri Rama leaves Ayodhya | Swami Samarpanananda");
		addVideoItem("sIHQtGAky3o", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 6 ", "Sri Rama crosses Ganga for Vanavas | Swami Samarpanananda");
		addVideoItem("NsmrlXPK2Os", "বাল্মীকিরামায়ণ |Ramayan-Bengali7 ", "SriRama’s lamentations| On way to Chitrakut | Swami Samarpanananda");

		addVideoItem("bCCsrw-DskI", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 8  ", "Sri Rama settles down at Chitrakut | Swami Samarpanananda");
		addVideoItem("VFYOLlrcl3s", "বাল্মীকিরামায়ণ | Ramayan (Bengali) 9 ", " Kaushalya’s anger and King Dasarath passes away");
		addVideoItem("0Xk4ALTE3lw", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 10 ", "Bharat on way to meet Sri Rama | Swami Samarpanananda");
		addVideoItem("YAcfAuVoA2c", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 11 ", "Bharat reaches Chitrakoot | Swami Samarpanananda");
		addVideoItem("bRm8LNa8EPc", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 12 ", " Sri Rama - Bharat Milan | Swami Samarpanananda");
		addVideoItem("9azvb4hlA9c", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 13 ", "Ansuya’s teachings to Sita | Swami Samarpanananda");
		addVideoItem("F66psA-CF1o", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 14 ", "Viradh vadh | Swami Samarpanananda");

		addVideoItem("YHmQ2r7mgMg", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 15  ", "Sri Rama meets Suteekshna | Swami Samarpanananda");
		addVideoItem("pfM1D8eKkzU", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 16 ", "Shurpanakha episode | Swami Samarpanananda");
		addVideoItem("25neJJGpwSM", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 17 ", "Ravan plans kidnapping of Sita | Swami Samarpanananda");
		addVideoItem("HRs00m3dq0c", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 18 ", "The Golden Deer | Swami Samarpanananda");
		addVideoItem("Ii8hDFJLu_I", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 19 ", " Ravan approaches Sita | Swami Samarpanananda");
		addVideoItem("R3CEB-ORmMc", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 20 ", " Ravan takes Sita to Lanka | Swami Samarpanananda");

		addVideoItem("8YN1o-s_-B0", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 21   ", "Scriptures and history | Swami Samarpanananda");
		addVideoItem("oDQ7GSRz7GE", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 22  ", "Lamentations of Sri Rama at the loss of Sita");
		addVideoItem("dZNmE3FtGVI", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 23 ", "Sri Rama Moves towards Pampa | Swami Samarpanananda");
		addVideoItem("7gTUoTHMKzM", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 24 ", " Sri Rama meets Mahavir Hanuman | Swami Samarpanananda ");
		addVideoItem("7W5VgnwqSmo", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 25 ", " Vali Vadh | Swami Samarpanananda");
		addVideoItem("3cr2jKefkD0", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 26 ", "Tara cries after Vali Vadh | Swami Samarpanananda");
		addVideoItem("9wls-Cq2DJc", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 27  ", " Lakshman threatens Sugreeva | Swami Samarpanananda");

		addVideoItem("wIObsFVjkr0", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 28 ", "বাল্মীকি রামায়ণ | Ramayan (Bengali) 28");
		addVideoItem("dmYv-JOh4uY", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand - 29 ", "Mahaveer Hanuman makes the jump");
		addVideoItem("XdUGa1l0rZ4", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand - 30 ", "Mahaveer Hanuman reaches Lanka");
		addVideoItem("wds3HrFh0VM", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand - 31  ", " Pushpak Viman | Swami Samarpanananda");
		addVideoItem("mkva7BUu6IE", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand 32  ", "Sita is found in Lanka | Swami Samarpanananda");

		addVideoItem("5IbEBgriKv8", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand - 33  ", "Hanuman watches Sita | Swami Samarpanananda");
		addVideoItem("3bisaCA8ZaU", "বাল্মীকি রামায়ণ | Ramayan - Sundar Kand - 34 ", "Ravana comes to meet Sita | Swami Samarpanananda");
		addVideoItem("ALDFzjeIawk", "বাল্মীকি রামায়ণ | Ramayan- Sundar Kand - 35 ", " Hanuman tries to approach Sita | Swami Samarpanananda");
		addVideoItem("HFCFl01FFiU", "বাল্মীকি রামায়ণ | Ramayan - Sundar Kand - 36 ", "Sita converses with Hanuman | Swami Samarpanananda");
		addVideoItem("=-rg6B6t-6mQ", "বাল্মীকি রামায়ণ | Ramayan (Bengali) Sundar Kand 37 ", "Sri Rama’s ring to Sita | Swami Samarpanananda");
		addVideoItem("7TVeSj8IHx4", "বাল্মীকি রামায়ণ | Ramayan Bengali-Sundar Kand 38 ", " Meghnad captures Hanuman ");

		addVideoItem("jl2TZToLxCM", "বাল্মীকি রামায়ণ | Ramayan - Sundar Kand - 39  ", "Ravana and Hanuman meet");
		addVideoItem("M6EWuTXG6Bs", "বাল্মীকি রামায়ণ | Ramayan-Sundar Kand - 40 ", "Mahaveer Hanuman burns Lanka");
		addVideoItem("rprB4FhA_z8", "বাল্মীকি রামায়ণ | Ramayan - Sundar Kand - 41 ", "Hanuman returns from Lanka");
		addVideoItem("5MvUCLaBpM4", "বাল্মীকি রামায়ণ | Ramayan - Yuddh Kand – 42 ", " Sri Rama readies for the war");
		addVideoItem("vgMBWRYiXLk", "বাল্মীকি রামায়ণ | Ramayan (Bengali)43", "Yuddh Kand - Sri Rama’s army marches");
		addVideoItem("OZnC1gdGdcE", "বাল্মীকি রামায়ণ | Ramayan – 44 ", "Yuddh Kand – Ravana consults ministers");
		addVideoItem("dQwActkV2nQ", "বাল্মীকি রামায়ণ | Ramayan 45 - Yuddh Kand ", "Vibhishana argues with Ravana");

		addVideoItem("1VJ9NXQlibk", "বাল্মীকিরামায়ণ | Ramayan 46  ", "Yuddh Kand–Vibhishana is made king by SriRama ");
		addVideoItem("I5-ck9pW-OI", "বাল্মীকি রামায়ণ | Ramayan 47 -Yuddh Kand ", "Sri Rama builds bridge over ocean");
		addVideoItem("b7dG0ANPDVU", "বাল্মীকি রামায়ণ | Ramayan – 48 ", "Yuddh Kand – Ravana tries to trick Sita");

		addVideoItem("aVKxxzE0CdE", "বাল্মীকি রামায়ণ | Ramayan (Bengali)– 49  ", "Yuddh Kand – Rama-Ravana war begins");
		addVideoItem("i2-EwBBgafs", "বাল্মীকি রামায়ণ | Ramayan 50  ", "Yuddh Kand–Kumbhakarna is killed by Sri Rama ");
		addVideoItem("U_1IR1K_E4k", "বাল্মীকি রামায়ণ | Ramayan 51 - Yuddh Kand ", "Meghnad is killed by Lakshman");
		addVideoItem("mnDJQLTd4zc", "বাল্মীকিরামায়ণ | Ramayan52-YuddhKand ", "Enmity lasts only till enemy is alive");
		addVideoItem("Zt2DJg6iBlU", "বাল্মীকি রামায়ণ | Ramayan (Bengali) – 53 ", " Yuddh Kand – Sita agni pareeksha");
		addVideoItem("Xu52uS5QFjM", "বাল্মীকি রামায়ণ | Ramayan 54-YuddhKand ", "Sri Rama returns to Ayodhya with Sita");
		addVideoItem("BjRRJDR-usk", "বাল্মীকি রামায়ণ | Ramayan (Bengali) – 55 ", "Sita Patal pravesh");


		createPlayList("রামায়ণ", R.drawable.category_9);

		//==========================================================================













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

