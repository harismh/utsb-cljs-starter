# 🔌 utsb-cljs-starter

<img width="828" alt="Screenshot 2024-10-09 at 13 15 08" src="https://github.com/user-attachments/assets/6a08b6b4-3f17-406a-a21a-456470067de9">

This repo started out as an exploratory exercise to help me familiarize myself with the latest CloureScript libraries and JavaScript tooling, namely:

- [<b>U</b>Ix CLJS React Wrapper](https://github.com/pitch-io/uix)
- [<b>T</b>ailwindCSS](https://tailwindcss.com)
- [<b>S</b>hadow CLJS](https://github.com/thheller/shadow-cljs)
- [<b>B</b>unJS](https://bun.sh)

The end result is a starter that creates a React SPA with excellent Shadow and Tailwind hot-reloading and production builds (~2KB CSS, ~70KB JS gzipped) all orchestrated by Bun.

## Getting started

3 steps to get up and running:

1. Install Bun if you haven't already: https://bun.sh/docs/installation.
2. Install all dependencies: `bun i`.
3. Start the starter: `bun dev`.

The app will launch on http://localhost:3000.

## Creating a production build

1 step to create an optimized build using :advanced compilation and Tailwind JIT: `bun prod`.

This will export the app to `/prod`. You can view it via serve: `bunx serve prod`.

## References

- [pitch-io/uix-starter](https://github.com/pitch-io/uix-starter)
- [jacekschae/shadow-cljs-tailwindcss](https://github.com/jacekschae/shadow-cljs-tailwindcss)

## License

Eclipse Public License 2.0
