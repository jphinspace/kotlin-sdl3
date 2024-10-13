import cnames.structs.SDL_Window
import kotlinx.cinterop.*
import sdl.*

@OptIn(ExperimentalForeignApi::class)
fun main() {
    SDL_Init(SDL_INIT_VIDEO)
    val window: CPointer<SDL_Window>? = SDL_CreateWindow(
        "HELLO WORLD",
        800,
        600,
        0u
    )
    val surface: CPointer<SDL_Surface>? = SDL_GetWindowSurface(window)
    SDL_FillSurfaceRect(
        surface,
        null,
        SDL_MapSurfaceRGB(
            surface,
            255u,
            255u,
            255u))
    SDL_UpdateWindowSurface(window)
    SDL_Delay(10000u)
    SDL_DestroyWindow(window)
    SDL_Quit()
}