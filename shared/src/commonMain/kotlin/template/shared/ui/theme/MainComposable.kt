package template.shared.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import template.shared.Greeting

/**
 * Main entry point to the application that can be rendered from
 * the iOS and Android applications.
 */
@Composable
fun MainComposable(
    modifier: Modifier = Modifier,
) {
    TemplateTheme {
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = modifier
                .fillMaxSize(),
        ) {
            Text(
                text = Greeting().greet(),
            )
        }
    }
}
