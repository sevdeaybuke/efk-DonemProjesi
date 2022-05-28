# EFK (Elasticsearch-Fluentd-Kibana) Yöntemi ile Web Uygulamalarının Performans Analizi

Bir web uygulaması kullanılmaya başlandığında; sistemde ve ağda meydana gelen 
olayların takibini kolaylaştırmak, analizini yapmak ve verimli şekilde kaynak tüketebilmeyi 
sağlamak artık çok daha kolay hale gelmeye başlamıştır. Sistemin yakaladığı ve sistemin 
performansına zarar verebilecek durumlar hakkında çok sayıda log tutulabilmektedir. Loglar, bir 
sistemin arızası veya bir olay meydana geldiğinde hatanın görülmesinde kolaylık sağlamaktadır. 
Bu çalışma kapsamında performans analizi yapabilmek için web uygulaması olarak Mangala 
Oyunu seçilmiştir. Web uygulamasında oluşan görüntü ve logları takip edebilmek için EFK 
merkezi loglama yönteminin kullanımı ele alınmıştır. Stres testi ile CPU, RAM, IO bilgileri, 
tıklanma, hata vb. gibi elde edilen verilerin analizi gerçekleştirilmiştir. Analiz sonucunda Mangala 
oyunu web uygulamasında minimum 8 core CPU değerinin yeterli olacağını ve 50 GB depolama 
alanının çok fazla olduğu görülmüştür.

# Kullanılan Yöntemler

Bu çalışmada performans analizi yapabilmek için açık kaynaklı Elasticsearch, Fluentd, 
Kibana, Prometheus, Grafana ve Node exporter teknolojileri kullanılmıştır.

# Kullanılan Web Uygulaması

Backend, Frontend uygulaması için REST API'leri sağlayan Spring Boot uygulamasıdır. 
Java 17 ile yazılmıştır. Aynı anda birden fazla oyun oturumunu desteklemektedir. Container 
(docker) mimarisine uygun olarak geliştirilmiş ve nginx tabanlıdır. (https://github.com/unlenen/mancalaGame)

