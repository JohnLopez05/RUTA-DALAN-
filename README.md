# RUTA — Know the danger. Find the safe way.

RUTA is an Android app that helps communities stay safe by mapping
user-reported hazards (floods, fires, road accidents, and more) on a live map
and computing a **Route to Safety** that avoids danger zones.

> CC106 — Application Development and Emerging Technologies
> St. John Paul II College of Davao

## Features

- **Live hazard map** — community-reported hazard pins with type, severity,
  photo, and confirmation counts, synced in real time via Firebase
- **Report Hazard** — guided 3-step flow: pick the type, pin the location,
  attach a camera photo
- **Route to Safety** — driving/walking directions that steer around reported
  hazards, drawn as a red line with distance and ETA
- **Map search** — find any place and route to it from your current location
- **4 map modes** — Streets, Satellite, Outdoor Terrain, and 3D Buildings,
  each with its own animated camera POV
- **Nearby alerts** — push notification when a new hazard is reported near you
- **Dashboard, Profile, Login/Signup** — full app shell with Firebase Auth

## Screenshots

| Dashboard | Map | Route to Safety |
|-----------|-----|-----------------|
| ![Dashboard](screenshots/dashboard.png) | ![Map](screenshots/map.png) | ![Route](screenshots/route.png) |

| Satellite | 3D Buildings | Report Hazard |
|-----------|--------------|---------------|
| ![Satellite](screenshots/map-satellite.png) | ![3D](screenshots/map-3d.png) | ![Report](screenshots/report.png) |

## Tech stack & APIs

| # | API | Used for |
|---|-----|----------|
| 1 | **MapTiler Cloud + MapLibre Native** | Map rendering, 4 map styles |
| 2 | **OpenRouteService** | Directions (Drive/Walk) and place search |
| 3 | **Firebase** (Firestore, Auth, Storage, FCM) | Hazard pins, login, photos, alerts |

- Language: **Java** · Min SDK 27 · Build: **Gradle (Kotlin DSL)**

## Getting started

1. Clone the repo and open it in **Android Studio**.
2. Copy `local.properties.example` to `local.properties` and fill in your keys:

   ```properties
   MAPTILER_API_KEY=your_maptiler_key
   ORS_API_KEY=your_openrouteservice_key
   ```

   - MapTiler key: free at <https://cloud.maptiler.com> (no credit card)
   - OpenRouteService key: free at <https://openrouteservice.org/dev/#/signup>
3. Add your `google-services.json` from the Firebase console into `app/`.
4. Publish `firestore.rules` and `storage.rules` in the Firebase console.
5. Sync Gradle, then **Run** on an emulator or device.

> `local.properties` is git-ignored — never commit real API keys.

## Project structure

```
RUTA/
├── app/                    # Android app module (Java)
│   └── src/main/
│       ├── java/com/example/rutas/   # Activities, map, routing, Firebase
│       └── res/                     # Layouts, drawables, icons, strings
├── gradle/                 # Gradle wrapper + version catalog
├── screenshots/            # App screenshots for this README
├── docs/                   # Setup guide and test checklist
├── firestore.rules         # Firestore security rules
├── storage.rules           # Firebase Storage security rules
├── local.properties.example# Template for API keys (copy to local.properties)
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

## Team

| Member | Role |
|--------|------|
| Mascariñas, Lester John | API Developer — MapTiler / MapLibre |
| Corpuz, Rhydelle | API Developer — OpenRouteService |
| Lopez, Philip John | Project Lead — Firebase |
| Monteverde, Mark John | UI/UX Developer — Map / Report / Navigation |
| Cabatingan, Mark John | UI/UX Developer — Login / Signup / Dashboard / Profile |
| Ando, Ernie Jay | QA & Documentation — Testing / Bug tracking |
| Casiaman, Niño | QA & Documentation — Annex A/B / README / Screenshots |
| Opimo, Romero | QA & Documentation — APK / Submission / Demo |

## License

School project — for academic use.
