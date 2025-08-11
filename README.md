# Çalışan Yönetimi API'si (Spring Boot Backend)

Bu proje, bir çalışan yönetim sistemi için geliştirilmiş bir RESTful API'dir. Veri tabanı işlemleri için Spring Boot, Spring Data JPA ve PostgreSQL kullanır.

## Özellikler

- **CRUD İşlemleri:** Çalışanlar için oluşturma (Create), okuma (Read), güncelleme (Update) ve silme (Delete) işlemleri.
- **RESTful End-point'ler:** HTTP metotları (`GET`, `POST`, `PUT`, `DELETE`) kullanılarak erişilebilen API uç noktaları.
- **CORS Desteği:** Ön yüz uygulamalarıyla sorunsuz iletişim kurabilmek için CORS ayarları yapılandırılmıştır.

## Teknolojiler

- **Backend:** Spring Boot, Java
- **Veri Tabanı:** PostgreSQL
- **ORM:** Spring Data JPA, Hibernate
- **Build Aracı:** Maven

## Gereksinimler

- Java 17 veya üzeri
- Maven
- Docker (PostgreSQL veri tabanı için)

## Başlangıç

1.  **Projeyi Klonla:**
    ```bash
    git clone [https://github.com/SENIN_GITHUB_ADIN/calisan-yonetim-web.git](https://github.com/SENIN_GITHUB_ADIN/calisan-yonetim-web.git)
    cd calisan-yonetim-web
    ```

2.  **Veri Tabanını Başlat:** Docker kullanarak PostgreSQL veri tabanını başlatın.
    ```bash
    docker run --name my-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres
    ```

3.  **Uygulamayı Çalıştır:** Maven ile Spring Boot uygulamasını başlatın.
    ```bash
    mvn spring-boot:run
    ```
    Uygulama, `http://localhost:8080` adresinde çalışmaya başlayacaktır.

## API Uç Noktaları

| HTTP Metodu | URL | Açıklama |
| :--- | :--- | :--- |
| `GET` | `/api/employees` | Tüm çalışanları listeler. |
| `POST` | `/api/employees` | Yeni bir çalışan ekler. |
| `PUT` | `/api/employees/{id}` | Belirli bir ID'ye sahip çalışanı günceller. |
| `DELETE` | `/api/employees/{id}` | Belirli bir ID'ye sahip çalışanı siler. |
