package com.example.tajikenglish.Topic.repository

import com.example.tajikenglish.Topic.repository.model.topicModel

class EnglishRepository {
    var array : ArrayList<topicModel> = ArrayList()
    fun getDictionaries(): ArrayList<topicModel> {
        array.add(topicModel(1,"I WANT TO BE AN INTERPRETER","I want to be an interpreter. It is an interesting and useful profession. My parents have a large library and they taught me to like books. I like reading books. My favourite subjects in school are English, Literature, Geography and History. My favourite English and American writers are Shakespeare, Dickens, Walter Scott, Jack London, Mark Twain.\n" +
                "\n" +
                "Once at the class of Literature, our teacher told us that, when translated, literary works lose much of their beauty. She said that poetry is very hard to translate. From that day I have a dream. I want to have my favourite books in the original and to know the languages they are written in. So I will enjoy the real beauty of these books.\n" +
                "\n" +
                "I also like reading books about other countries and cultures. It is so interesting to learn that other people think differently.\n" +
                "\n" +
                "I want to become an interpreter because of some reasons. It is an interesting profession because an interpreter meets people from different countries and cultures all the time and has an opportunity to learn much about them. Besides, this profession is very useful because it helps people to understand each other.","МАН МЕХОҲАМ ТАРҶУМОН ШАВАМ!","Ман мехоҳам тарҷумон шавам. Ин касби шавқовар ва фоидабахше аст. Падару модарам китобхонаи бузурге доранд ва ин боргоҳ китобдӯстиро ба ман омӯзонид. Ба ман хониши китоб хеле писанд аст. Фанҳои дӯстдоштаи мактабӣ – забони англисӣ, адабиёт, ҷуғрофия ва таърих мебошад. Нависандагони инглис ва амрикоии писандидаам Шекспир, Диккенс, Волтер Скотт, Ҷек Лондон, Марк Твен мебошанд.\n" +
                "\n" +
                "Боре дар дарси адабиёт муаллимаи мо гуфт, ки асарҳои адабӣ қисмати асосии мӯҳтавояшро дар тарҷума аз даст медиҳад. Ӯ мегӯяд, тарҷумаи назм хеле мушкил аст. Аз ин рӯз ман соҳиби орзу гардидам. Мехоҳам, ки китобҳои дӯстдоштаамро дар нусхаи асл дошта, забонҳоеро донам, ки ин китобҳо ба он навишта шудааст. Бо ин васила, метавонам аз ҳақиқати он лаззат бибарам.\n" +
                "\n" +
                "Ҳамчунин бароям мутолиаи китоб перомуни кишварҳои дигар ва маданияти онҳо писанд аст. Донистани он шавқовар аст, зеро фикри мардуми дигар аз фикри мо фарқ дорад.\n" +
                "\n" +
                "Бо якчанд сабабҳо мехоҳам тарҷумон шавам. Ин касби шавқовар аст, зеро тарҷумон ҳамеша бо мардуми кишварҳои гуногун ва маданияти онҳо бармехӯрад ва имкон дорад, то ки иттиллооти зиёд ба даст оварад. Ба ҷуз ин, касби мазкур хеле манфиатбахш буда, ба мардум барои фаҳмиши якдигар мусоидат мекунад.","interpreter – тарҷумон, мутарҷим\n" +
                "\n" +
                "to lose – гум кардан, аз даст додан, маҳрум шудан\n" +
                "\n" +
                "literary works – осори адабӣ\n" +
                "\n" +
                "opportunity – имконият, имтиёз","\n" +
                "1.Do you like reading books?\n" +
                "\n" +
                "2.What are your favourite subjects in school?\n" +
                "\n" +
                "3.Who are your favourite writers?\n" +
                "\n" +
                "4.Do you think that literary works lose much when translated?\n" +
                "\n" +
                "5.Why is the profession of an interpreter interesting?\n" +
                "\n" +
                "6.Why is it useful?"))
        array.add(topicModel(2,"I WANT TO BE A DOCTOR ","There are many interesting and noble professions. I want to be a doctor. It is an interesting profession. I understand that it is necessary to study a lot to become a doctor. I also understand that this profession requires great responsibility because it deals with the most precious thing that a person has – with his health. My mother and my grandfather are doctors. My grandfather is working as a surgeon in a hospital. I have been several times at the hospital and spent some time watching him working. His main task is to operate on the people. After each operation he takes care of patients until they are recovered.\n" +
                "\n" +
                "He listens very attentively to what his patients tell him. He is always kind and attentive to his patients. They feel it and believe him, and it makes his work easier. I know that he wants to see all his patients able – bodied and I notice that he is happy when his patient is recovered.\n" +
                "\n" +
                "My grandfather can also help if somebody catches a cold or has a fever. My grandfather told me a lot of true stories about doctors and their profession.\n" +
                "\n" +
                "I love and respect my grandfather and want to become a doctor as well.","МАН МЕХОҲАМ ДУХТУР ШАВАМ!","Касбҳои шавқовар ва бошараф зиёд аст. Мехоҳам, то ки духтур шавам. Он касби шавқовар аст. Ман мефаҳмам, ки барои духтур шудан, мутолиаи зиёд бояд кард. Инчунин, медонам, ки ин касб масъулияти хоса металабад ва арзишмандтарин қазияи инсон, яъне ба саломатӣ алоқаманд аст. Модар ва бобои ман духтуранд. Бобоям дар бемористон чун духтури ҷарроҳ кор мекунад. Ман борҳо бо ӯ дар бемористон будам ва мушоҳида намудам, ки ӯ чӣ тавр кор мекунад.\n" +
                "\n" +
                "Вазифаи асосии ӯ аз ҷарроҳии инсон иборат аст. Пас аз ҳар ҷарроҳӣ, ӯ ба бемор то шифо ёфтанаш ғамхорӣ менамояд. Ӯ ҳар чизе, ки бемор мегӯяд, бодиққат гӯш медиҳад. Ӯ ба беморон ҳамеша меҳрубон ва бодиққат муносибат мекунад. Онҳо ба ӯ бовар доранд ва амалашро осон мегардонанд. Ман медонам, ки ӯ мехоҳад ҳамаи беморонро сиҳату саломат бинад ва мушоҳида кардам, ки агар бемор сиҳату саломат гардад, ӯ худро хушбахт меҳисобад.\n" +
                "\n" +
                "Ҳамчунин бобоям метавонад ба маризони шамолхӯрда ва ашхосе, ки ҳарорати баланд доранд, ёрӣ расонад. Бобоям ба ман таърихи ҳақиқии духтурон ва касби онҳоро нақл кардааст.\n" +
                "\n" +
                "Ман бобоямро дӯст медорам ва эҳтиром менамоям ва мехоҳам мисли ӯ духтур шавам.","noble – благородный\n" +
                "\n" +
                "necessary – зарур, лозим, воҷиб, муҳим\n" +
                "\n" +
                "to require – талаб (иддао, тақозо) кардан, хостан, талабидан\n" +
                "\n" +
                "responsibility – масъулият, ҷавобгарӣ, ӯҳдадорӣ\n" +
                "\n" +
                "precious – қиматбаҳо, арзанда, муҳим, зарур\n" +
                "\n" +
                "surgeon – ҷарроҳ\n" +
                "\n" +
                "to be recovered – сиҳат шудан, шифо ёфтан, офият ёфтан\n" +
                "\n" +
                "able-bodied – тандуруст, солим, сиҳат, бардам, тануманд","1.Is it necessary to study to become a doctor?\n" +
                "\n" +
                "2.Is profession of a doctor connected with a great responsibility? Why?\n" +
                "\n" +
                "3.Have you seen a doctor working?\n" +
                "\n" +
                "4.In your opinion, must a doctor be a kind and attentive person?\n" +
                "\n" +
                "5.What do you think, is it pleasant to see a person healthy again?\n" +
                "\n" +
                "6.What else do you know about doctors and their profession?"))
        array.add(topicModel(3,"I WANT TO BE A JOURNALIST","I decided to be a journalist. I think it is an interesting and useful profession. I like to watch TV, listen to the radio, read newspapers and magazines. I like everything which connected with mass media. I have a hobby. My friends and I are publishing a small newspaper once a month in our school. We write articles about school events, life of young people, jokes, draw pictures and caricatures.\n" +
                "\n" +
                "My favourite school subjects are history and literature. I like the profession of a journalist. They meet many people. They try to understand what is going on in the world, or the country, or the city and try to explain it to other people. I think that the work of a journalist is very much like that of historian. A historian studies and tries to explain events of the past and a journalist does the same about the present. But for me to be a journalist is much more interesting than to be a historian because you deal with real events that are happening right now so you can even influence them. So journalists can influence the history. That is why I want to be a journalist.","МАН МЕХОҲАМ РӮЗНОМАНИГОР ШАВАМ!","Ман ба қароре расидам, ки рӯзноманигор шавам. Ба фикри ман, он касби шавқовар ва манфиатбахш аст. Намоиши телевизион, шунидани радио, хондани рӯзнома ва маҷаллаҳо бароям писанд аст. Ҳар маводе, ки ба воситаҳои ахбори омма алоқаманд аст, писандам аст. Бо дӯстон рӯзномаи начандон калонро дар мактаб моҳе як маротиба нашр мекунем. Мақолаҳо дар бораи рӯйдодҳои мактаб, ҳаёти ҷавонон, ҳазлу шӯхӣ менависем, расму карикатураҳо мекашем.\n" +
                "\n" +
                "Фанҳои дӯстдоштаи мактабиам, таърих ва адабиёт аст. Ба ман касби рӯзноманигорӣ писанд аст. Рӯзноманигорон бо мардуми зиёд вомехӯранд. Онҳо рӯйдоду ҳодисаҳои дунё, дохили мамлакат ва шахрҳоро кӯшиш ба харҷ медиҳанд, то ки худ бифаҳманд, баъдан мардум бифаҳмонанд. Фикр мекунам, ки рӯзноманигорӣ бо таърихшиносӣ шабоҳат дорад. Муаррих ҳодисаи гузаштаро меомӯзад ва кӯшиши баёни он мекунад, аммо рӯзноманигор ин корро дар айни замон анҷом медиҳад. Лекин барои ман касби рӯзноманигор бештар аз муаррих аст, зеро бо ҳаводиси воқеӣ, ки мустақиман имрӯз рӯй медиҳад ва он тағйирпазир аст, иртибот длрад. Ҳамин тариқ, рӯзноманигорон метавонанд ба таърих низ таъсир расонанд. Бинобар ин, ман мехоҳам рӯзноманигор шавам.","mass media – васоити ахбори омма\n" +
                "\n" +
                "to publish – нашр (чоп, табъ) кардан, аз чоп баровардан, ба табъ расонидан\n" +
                "\n" +
                "historian – таърихшинос, муаррих\n" +
                "\n" +
                "event – воқеа, ҳодиса, рӯйдод\n" +
                "\n" +
                "to influence – таъсир кардан (расондан), нуфуз доштан","1.What do you like to do?\n" +
                "\n" +
                "2.Do you have a hobby? What is it?\n" +
                "\n" +
                "3.What are your favourite school subjects?\n" +
                "\n" +
                "4.Is the profession of a journalist similar to that of a historian?\n" +
                "\n" +
                "5.What is the difference between them?\n" +
                "\n" +
                "6.Why do you like profession of a journalist more?"))
        array.add(topicModel(4,"I WANT TO BE A BUSINESSMAN","My father is working for an international company as a managing director. I have been several times at his office. I like it very much to be there. My father is very busy. He often comes late from work. But I can see that he likes his job. And he always finds the time to spend with me and mam. Sometimes he tells us about the difficult situations, which his company faces. It is so interesting to listen to him. It seems to me that you need to have a very creative mind to be a businessman.\n" +
                "\n" +
                "My father is a friendly person and he is easy to talk to. I respect my father and I want to become a businessman too. I think our country needs good businesspeople to strengthen its economy.\n" +
                "\n" +
                "After I finish school I’m going to enter the university and study marketing or management. I haven’t decided yet exactly what will I study. Manager deals mainly with people. It studies what is necessary to do that people worked better and were not offended. Marketing deals with market research and commercial activity in general. I still have time to think and choose.","МАН МЕХОҲАМ ТОҶИР БОШАМ","Падари ман тоҷир аст ва дар ташкилоти байналхалқӣ кор мекунад. Ман якчанд маротиба дар коргоҳи ӯ будам. Ба ман он ҷо писанд аст. Падарам ба кор сахт гирифтор аст. Пайваста, ба хона дер меояд. Аммо мушоҳида мекунам, ки ба ӯ кораш писанд аст ва ҳамеша барои бо ману модарам гузаронидани вақт, имкон пайдо мекунад. Гоҳо ӯ ба мо дар бораи вазъияти мураккабе, ки корхона ба он гирифтор шудааст, ҷиҳати ҳалли онро нақл мекунад. Шунидани нақли ӯ хеле шавқовар аст. Ба назари ман чунин мерасад, ки тоҷир бояд соҳиби хазинаи эҷодии ақл бошад.\n" +
                "\n" +
                "Падарам муомилаи хуб дорад ва бо ӯ сӯҳбат оростан саҳл аст. Ман падарамро эҳтиром мекунам ва мехоҳам тоҷир бошам. Ба фикрам, кишвари мо ба тоҷирони хуб эҳтиёҷ дорад, зеро иқтисодиёти мамлакат устувор хоҳад гардид.  \n" +
                "\n" +
                "Пас аз хатми мактаб, мекӯшам, ки ба донишгоҳ дохил шавам ва соҳаҳои маркетинг ё менеҷментро биомӯзам. Ҳоло перомуни интихоби касби ояндаам дақиқан ба қароре наомадаам. Менеҷер бештар бо мардум фаолият дорад. Ӯ амалеро меомӯзонад, ки бояд онро анҷом дод, мардум бояд хуб кор кунанд ва эшонро набояд ранҷонид. Маркетинг, дар маҷмӯъ тадқиқи талаботи бозор ва фаолияти тиҷоратӣ мебошад. Алҳол, ман барои интихоби касб вақт дорам.","managing director – роҳбар, роҳнамо, мудир, маъмур\n" +
                "\n" +
                "office – идора\n" +
                "\n" +
                "creative mind – махзани эҷодӣ\n" +
                "\n" +
                "to strengthen – маҳкам (мустаҳкам) кардан; устувор (пойдор) кардан\n" +
                "\n" +
                "to offend – ранҷондан, озор додан (расондан), озурдан, хафа кардан\n" +
                "\n" +
                "to deal with – бо касе, бо чизе сарукор доштан, иртибот доштан","1.In your opinion, how much time should a businessman work and how much time should he spend with his family?\n" +
                "\n" +
                "2.Is a creative mind necessary for a businessperson?\n" +
                "\n" +
                "3.Is there a need for businesspeople in our country?\n" +
                "\n" +
                "4.What does marketing deals with?\n" +
                "\n" +
                "5.What does manager deals with?\n" +
                "\n" +
                "6.Are there any other reasons for you to become a businessperson?"))
//        array.add(topicModel(5,"Hello","Mother"))
//        array.add(topicModel(6,"Hello","Mother"))
//        array.add(topicModel(7,"Hello","Mother"))


        return array
    }
}