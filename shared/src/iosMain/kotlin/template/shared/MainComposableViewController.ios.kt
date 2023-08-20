package template.shared

import androidx.compose.ui.window.ComposeUIViewController
import template.shared.ui.theme.MainComposable

/**
 * Creates a [ComposeUIViewController] which is used on iOS
 * to render composable content. This is just an entry point
 * into our [MainComposable].
 */
fun mainComposableViewController() = ComposeUIViewController {
    MainComposable()
}
