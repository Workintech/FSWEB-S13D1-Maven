# Introduction To Java :)

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatlı bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### Havlayan Köpeğimiz

* Havlamayı seven bir köpeğimiz var. Eğer köpeğimiz geceleri havlarsa uyanacağız ama gündüzleri havlarsa tepki vermeyeceğimiz bir metod yazmaya çalışacağız.
* ```shouldWakeUp``` isimli metodumuz 2 tane parametre almalı. İlk parametre ```boolean``` olmalı ve köpeğin şu an havlayıp havlamadığını tutmalı.
* İkinci parametremiz ```int``` değer almalı. 0-23 arasında değer alabilir. Köpeğimiz akşam 8 ile sabah 8 arasında havlıyorsa metod ```true``` değer dönmeli.
* Diğer şartlar altında metodumuz ```false``` değer dönmeli.
* İkinci parametre 0'dan küçükse ya da 23'den büyükse metodumuz yine ```false``` değer dönmeli.


shouldWakeUp (true, 1); => true dönmeli(Gece 1'de köpeğimiz havlıyor)

shouldWakeUp (false, 2); => false dönmeli.(köpek havlamıyor.)

shouldWakeUp (true, 8); => false dönmeli.(8'den sonra ise tepki vermeliyiz.)

shouldWakeUp (true, -1); => false dönmeli(-1 geçersiz değer)


### Yaş Tespiti

* ```hasTeen``` isimli 3 tane parametre alan bir metod yazmak istiyoruz.
* 3 parametreden herhangi biri eğer 13-19 arasındaysa metod ```true``` değer dönmeli
* Diğer şartlarda ```false``` değer dönmeli.

hasTeen(9, 99, 19); => true dönmeli.(19 değerinden dolayı)

hasTeen(23, 15, 42); => true dönmeli.(15 değerinden dolayı)

hasTeen(22, 23, 34); => false dönemli(Hiçbir değer 13-19 arasında değil.)



### Oyuncu Kedi

* Oyun oynamayı çok seven bir kedimiz var. Kedimizin oyun oynadığı zamanları tespit etmek için bir metod yazacağız.
* Kedimiz sıcaklık 25 ile 35 arasındaysa oyun oynuyor olucak. Eğer mevsim yaz değilse. Mevsim yaz ise üst limit 35 yerine 45 olmalı.
* ```isCatPlaying``` isimli 2 tane parametre alan bir metod yazmak istiyoruz. Eğer kedi oyun oynuyorsa metodumuz ```true``` değer dönecek. Oyun oynamıyorsa ```false``` değer dönecek.
* İlk parametre ```boolean``` değer tutmalı ve mevsimin yaz olup olmadığını kontrol etmeli
* İkinci parametre ```int``` olamlı ve sıcaklık değerini tutmalı.


isCatPlaying(true, 10); => false dönmeli(sıcaklık 25-45 arasında olmalıydı)

isCatPlaying(false, 36); => false dönmeli(sıcaklık 25-35 arasında olmalıydı)

isCatPlaying(false, 35); => true dönmeli(sıcaklık 25-35 arasında.)


### Alan Hesaplama

* Dikdörtgenin alanını hesaplamak için bir metod yazınız. Metodun ismi ```area``` olmalı.
* İki tane ```double``` parametre almalı ve bu parametreleri kullanıcıdan almalı.
* Eğer parametrelerden herhangi biri negatif değer alırsa, alan negatif olamayacağından metod ```-1``` değer dönerek yanlış bir işlem yapıldığını belirtmeli.
* Metod iki değeri birbiriyle çarpmalı ve değeri ```return``` etmeli.

area(5.0, 4.0); => 20.0 değerini dönmeli.

area(-1.0, 4.0); => -1 değerini dönmeli.

* Bir tane daha ```area``` isimli bir metod tanımla. Amacımız dairenin alanını hesaplamak.
* bu sefer tek bir ```double``` parametresi almalı. İsmi radius olabilir. Bu parametrede kullanıcıdan alınmalı.
* parametre negatif bir dğer alırsa metod yine -1 dönmeli.
* Diğer şartlarda metod ```radius*radius*Math.PI``` değerini dönmeli
* Math.PI kullandığında ```java.lang``` paketinde olduğu otomatik `import` ediliyor, ekstra bir şey yapmana gerek yok. 

area(5.0); => 78.53975 değerini dönmeli

area(-1); => -1 değerini dönmeli.

### 🧪 Testleri Çalıştırma

NextGen üzerinde proje sonuçlarınızı görebilmek için testleri çalıştırmanız gerekmektedir.

1. `ResultAnalyzer.java` dosyasını açın ve şu satırı NextGen proje ekranında görünen kendi bilginizle güncelleyin:

```java id="k2k3xv"
String userId = "999999";
```

2. Ardından `MainTest.java` dosyasını çalıştırarak testleri başlatabilirsiniz.

3. Gerektiğinde proje çözümlerinizi kontrol edebilmemiz için kodlarınızı GitHub'a pushlamayı unutmayın.